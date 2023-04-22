package solutions;

public class Problem017 {

    public int solve() {
        int sum = 11; // one thousand
        for (int number = 1; number < 1000; number++) {
            int hundreds = number / 100;
            int tens = (number % 100) / 10;
            int units = number % 10;
            if (hundreds > 0) {
                sum += getNumberOfLetters(hundreds) + 7; // hundred
                if (tens > 0 || units > 0) {
                    sum += 3; // and
                }
            }
            if (tens == 1) {
                sum += getNumberOfLetters(tens * 10 + units);
            } else {
                sum += getNumberOfLetters(tens * 10) + getNumberOfLetters(units);
            }
        }
        return sum;
    }

    private int getNumberOfLetters(int number) {
        return switch (number) {
        case 1, 2, 6, 10 -> 3;
        case 4, 5, 9 -> 4;
        case 3, 7, 8, 40, 50, 60 -> 5;
        case 11, 12, 20, 30, 80, 90 -> 6;
        case 15, 16, 70 -> 7;
        case 13, 14, 18, 19 -> 8;
        case 17 -> 9;
        default -> 0;
        };
    }
}
