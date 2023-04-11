package utils;

public class PolygonalUtils {

    public static boolean isTriangular(long number) {
        return isSquare(8 * number + 1);
    }

    public static boolean isSquare(long number) {
        long root = (long) Math.sqrt(number);
        return root * root == number;
    }

    public static boolean isPentagonal(long number) {
        long root = (long) Math.sqrt(24 * number + 1);
        return root * root == 24 * number + 1 && (root - 5) % 6 == 0;
    }

    public static boolean isHexagonal(long number) {
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

    public static int[] getPentagons(int size) {
        int[] pentagons = new int[size + 1];
        pentagons[0] = 1;
        pentagons[1] = 5;
        for (int i = 2; i < pentagons.length; i++) {
            pentagons[i] = 2 * pentagons[i - 1] - pentagons[i - 2] + 3;
        }
        return pentagons;
    }
}
