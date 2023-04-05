package solutions;

public class Problem003 {

    public int solve() {
        // The number is odd, no need to check if 2 is a factor
        long number = 600851475143L;
        int factor = 1;
        while (number > 1) {
            factor += 2;
            while (number % factor == 0) {
                number /= factor;
            }
        }
        return factor;
    }
}
