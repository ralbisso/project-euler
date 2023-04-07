package utils;

public class StringUtils {

    private final static String ALPHABET = "\"ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static int getScore(int i, String name) {
        int score = 0;
        for (char c : name.toCharArray()) {
            score += ALPHABET.indexOf(c);
        }
        return score * (i + 1);
    }

    public static int getScore(String word) {
        int score = 0;
        for (char c : word.toCharArray()) {
            score += ALPHABET.indexOf(c);
        }
        return score;
    }
}
