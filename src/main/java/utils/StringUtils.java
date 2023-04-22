package utils;

public class StringUtils {

    private final static String ALPHABET = "\"ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static int getScore(String string) {
        int score = 0;
        for (char c : string.toCharArray()) {
            score += ALPHABET.indexOf(c);
        }
        return score;
    }
}
