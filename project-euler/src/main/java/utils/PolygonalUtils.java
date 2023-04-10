package utils;

public class PolygonalUtils {

    public static boolean isTriangular(int number) {
        return isSquare(8 * number + 1);
    }

    public static boolean isSquare(int number) {
        int root = (int) Math.sqrt(number);
        return root * root == number;
    }

    public static boolean isPentagonal(int number) {
        int root = (int) Math.sqrt(24 * number + 1);
        return root * root == 24 * number + 1 && (root - 5) % 6 == 0;
    }

    public static boolean isHexagonal(int number) {
        return isSquare(8 * number + 1);
    }

    public static int[] getTriangles(int size) {
        int[] triangles = new int[size + 1];
        triangles[0] = 1;
        for (int i = 1; i < triangles.length; i++) {
            triangles[i] = triangles[i - 1] + i + 1;
        }
        return triangles;
    }
}