package solutions;

public class Problem097 {

    public long solve() {
        long prime = 28433;
        for (int i = 0; i < 7830457; i++) {
            prime = (prime * 2) % 10000000000L;
        }
        return prime + 1;
    }
}
