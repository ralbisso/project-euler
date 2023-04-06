package solutions;

public class Problem003 {

    public int solve() {
        long number = 600851475143L;
        int factor = 2;
        while (number > 1) {
            factor++;
            while (number % factor == 0) {
                number /= factor;
            }
        }
        return factor;
    }
}
