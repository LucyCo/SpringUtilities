package lucyexercises.codility.ex4;

public class FindMissingVal {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int n = A.length + 1;
        int requiredSum = (n)*(1+n)/2;
        int actualSum = 0;
        for (int a : A) {
            actualSum += a;
        }
        return requiredSum - actualSum;
    }
}
