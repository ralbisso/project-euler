package solutions;

public class Problem094 {

    public int solve() {
        int sumOfFirst100Numbers = 100 * (100 + 1) / 2;
        int sumOfFirst100Squares = 100 * (100 + 1) * (2 * 100 + 1) / 6;
        int sumOfFirst100NumbersSquared = sumOfFirst100Numbers * sumOfFirst100Numbers;
        return sumOfFirst100NumbersSquared - sumOfFirst100Squares;
    }
}
