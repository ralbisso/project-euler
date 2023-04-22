package solutions;

public class Problem028 {

    public int solve() {
        int sum = 1, count = 1, increment = 2, spiral = 1001;
        for (int number = 3; number <= spiral * spiral; number += increment) {
            if (count++ % 4 == 0) {
                increment += 2;
            }
            sum += number;
        }
        return sum;
    }
}
