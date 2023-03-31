package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileUtils {

    private final static String RESOURCES = "src/main/resources/";

    public final static String P008 = "p008_series";
    public final static String P011 = "p011_grid";
    public final static String P013 = "p013_large_sum";
    public final static String P018 = "p018_triangle";
    public final static String P067 = "p067_triangle";
    public final static String P081 = "p081_matrix";
    public final static String P082 = "p082_matrix";
    public final static String P083 = "p083_matrix";
    public final static String P099 = "p099_base_exp";

    public static List<String> getAllLines(String fileName) {
        Path filePath = Paths.get(RESOURCES + fileName);
        List<String> lines = null;
        try {
            lines = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.format("I/O error: %s%n", e);
        }
        return lines;
    }

    public static int[][] getAllLinesAsGrid(String fileName) {
        var input = getAllLines(fileName);
        var grid = new int[input.size()][];
        for (int i = 0; i < grid.length; i++) {
            var split = input.get(i).split(" ");
            var row = new int[split.length];
            for (int j = 0; j < row.length; j++) {
                row[j] = Integer.parseInt(split[j]);
            }
            grid[i] = row;
        }
        return grid;
    }
}
