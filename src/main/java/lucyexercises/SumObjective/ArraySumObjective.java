package lucyexercises.SumObjective;

import java.util.Iterator;
import java.util.List;

public class ArraySumObjective {

    public boolean isSumObjectiveAchieved(List<int[]> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        try {
            checkListObjective(list);
        } catch (ObjectiveFailedExpection objectiveFailedExpection) {
            return false;
        }
        return true;
    }

    private void checkListObjective(List<int[]> list) throws ObjectiveFailedExpection {
        Objective objective = new Objective(list.size());
        int col = 0;
        boolean anyArrayRead;
        do {
            anyArrayRead = false;
            int row = 0;
            Iterator<int[]> iterList = list.iterator();
            while (iterList.hasNext()) {
                int[] curArray = iterList.next();
                if (curArray.length <= col) {
                    objective.endRow(row);
                    row++;
                    continue;
                }
                anyArrayRead = true;
                objective.add(row, curArray[col]);
                row++;
            }
            objective.endCol();
            col++;
        } while (anyArrayRead);
    }

    class Objective {
        private int[] currentSums;
        private boolean colSumAchieved = true;
        private boolean currColSumAchieved = true;
        Integer totalSumObjective;
        Integer lastSum;

        Objective(int size) {
            currentSums = new int[size];
        }

        public void add(int row, int value) {
            this.currentSums[row] += value;
            if (lastSum != null && lastSum != this.currentSums[row]) {
                currColSumAchieved = false;
            }
            lastSum = this.currentSums[row];
        }

        public void endCol() {
            if (currColSumAchieved) {
                colSumAchieved = true;
            }
            currColSumAchieved = true;
            lastSum = null;
        }

        public void endRow(int rowNum) throws ObjectiveFailedExpection {
            if (!colSumAchieved) {
                throw new ObjectiveFailedExpection();
            }
            if (totalSumObjective == null) {
                totalSumObjective = currentSums[rowNum];
            } else if (totalSumObjective != currentSums[rowNum]) {
                throw new ObjectiveFailedExpection();
            }
        }
    }

    class ObjectiveFailedExpection extends Exception {}
}
