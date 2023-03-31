package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileUtils {

    private final static String RESOURCES = "src/main/resources/";

    public final static String P008 = "p008_series";
    public final static String P013 = "p013_large_sum";
    public final static String P018 = "p018_triangle";
    public final static String P067 = "p067_triangle";

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

}
