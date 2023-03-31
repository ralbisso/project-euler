package solutions;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Problem096 {

    public int solve() {
        Map<Integer, Integer> factorization = new TreeMap<>();
        for (int number = 2; number <= 20; number++) {
            for (Entry<Integer, Integer> e : getFactorization(number).entrySet()) {
                int factor = e.getKey(), multiplicity = e.getValue();
                if (factorization.containsKey(factor) && factorization.get(factor) > multiplicity) {
                    continue;
                }
                factorization.put(factor, multiplicity);
            }
        }
        return getNumber(factorization);
    }

    private Map<Integer, Integer> getFactorization(int number) {
        Map<Integer, Integer> factorization = new TreeMap<>();
        int factor = 2;
        while (number > 1) {
            int multiplicity = 0;
            while (number % factor == 0) {
                multiplicity++;
                number /= factor;
            }
            if (multiplicity > 0) {
                factorization.put(factor, multiplicity);
            }
            factor++;
        }
        return factorization;
    }

    private int getNumber(Map<Integer, Integer> factorization) {
        int number = 1;
        for (Entry<Integer, Integer> e : factorization.entrySet()) {
            int factor = e.getKey(), multiplicity = e.getValue();
            for (int m = 0; m < multiplicity; m++) {
                number *= factor;
            }
        }
        return number;
    }
}
