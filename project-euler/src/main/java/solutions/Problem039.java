package solutions;

import objects.Triangle;

public class Problem039 {

    public int solve() {
        int perimeter = 0, max = 0, limit = 1000;
        int[] perimeters = new int[limit + 1];
        for (int a = 1; a < limit; a++) {
            for (int b = a; a + b < limit; b++) {
                for (int c = b + 1; a + b + c <= limit; c++) {
                    var triangle = new Triangle(a, b, c);
                    int trianglePerimeter = triangle.getPerimeter();
                    if (triangle.isRectangle() && ++perimeters[trianglePerimeter] > max) {
                        max = perimeters[trianglePerimeter];
                        perimeter = trianglePerimeter;
                    }
                }
            }
        }
        return perimeter;
    }
}
