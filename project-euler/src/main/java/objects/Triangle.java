package objects;

public record Triangle(int a, int b, int c) {

    private int getPerimieter() {
        return a + b + c;
    }

    private double getSemiPerimeter() {
        return getPerimieter() / 2.0;
    }

    public double getArea() {
        double s = getSemiPerimeter();
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
