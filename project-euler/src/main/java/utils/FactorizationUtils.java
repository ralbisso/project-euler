package utils;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class FactorizationUtils {

    public static Map<Integer, Integer> getFactorization(int number) {
        Map<Integer, Integer> factorization = new TreeMap<>();
        int multiplicity = 0;
        if (number % 2 == 0) {
            while (number % 2 == 0) {
                multiplicity++;
                number /= 2;
            }
            factorization.put(2, multiplicity);
        }
        int factor = 3;
        while (number > 1) {
            multiplicity = 0;
            while (number % factor == 0) {
                multiplicity++;
                number /= factor;
            }
            if (multiplicity > 0) {
                factorization.put(factor, multiplicity);
            }
            factor += 2;
        }
        return factorization;
    }

    public static int getNumber(Map<Integer, Integer> factorization) {
        int number = 1;
        for (Entry<Integer, Integer> e : factorization.entrySet()) {
            int factor = e.getKey(), multiplicity = e.getValue();
            for (int m = 0; m < multiplicity; m++) {
                number *= factor;
            }
        }
        return number;
    }

    public static int getNumberOfDivisors(int number) {
        int numberOfDivisors = 1;
        while (number % 2 == 0) {
            numberOfDivisors++;
            number /= 2;
        }
        int factor = 3;
        while (number > 1) {
            int multiplicity = 0;
            while (number % factor == 0) {
                multiplicity++;
                number /= factor;
            }
            numberOfDivisors *= multiplicity + 1;
            factor += 2;
        }
        return numberOfDivisors;
    }
}
