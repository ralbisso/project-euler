package solutions;

public class Problem001 {

    public int solve() {
        int sum = 0;
        for (int number = 1; number < 1000; number++) {
            if (number % 3 == 0 || number % 5 == 0) {
                sum += number;
            }
        }
        return sum;
    }
}
