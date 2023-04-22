package solutions;

public class Problem002 {

    public int solve() {
        int sum = 0;
        int[] fibonacci = { 0, 1 };
        while (fibonacci[1] < 4000000) {
            if (fibonacci[1] % 2 == 0) {
                sum += fibonacci[1];
            }
            int next = fibonacci[0] + fibonacci[1];
            fibonacci[0] = fibonacci[1];
            fibonacci[1] = next;
        }
        return sum;
    }
}
