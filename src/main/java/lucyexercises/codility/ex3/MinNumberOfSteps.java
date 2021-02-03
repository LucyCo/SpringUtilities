package lucyexercises.codility.ex3;

public class MinNumberOfSteps {

    public int solution(int X, int Y, int D) {
        int kalan = (Y - X) % D;
        int adim = kalan == 0 ? (Y - X) / D :(Y - X - kalan) / D + 1 ;
        return adim;
    }
}
