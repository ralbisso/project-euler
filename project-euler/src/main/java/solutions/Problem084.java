package solutions;

public class Problem084 {

    public int solve() {
        int sum = 0;
        int[] fibonacci = { 0, 1 };
        while (fibonacci[1] < 4000000) {
            int next = fibonacci[0] + fibonacci[1];
            fibonacci[0] = fibonacci[1];
            fibonacci[1] = next;
            if (next % 2 == 0) {
                sum += next;
            }
        }
        return sum;
    }
}
