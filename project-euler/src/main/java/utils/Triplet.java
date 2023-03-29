package utils;

public record Triplet(int a, int b, int c) {

    public int product() {
        return a * b * c;
    }

    public boolean isPythagorean() {
        return a * a + b * b == c * c;
    }
}
