package solutions;

public class Problem031 {

    public int solve() {
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
