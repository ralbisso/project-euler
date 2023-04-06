package objects;

public record Triangle(int a, int b, int c) {

    public boolean isRectangle() {
        return a * a + b * b == c * c;
    }

    public int getPerimeter() {
        return a + b + c;
    }

    private double getSemiPerimeter() {
        return getPerimeter() / 2.0;
    }

    public double getArea() {
        double s = getSemiPerimeter();
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
