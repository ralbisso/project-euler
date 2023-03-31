package solutions;

import static utils.FactorizationUtils.getFactorization;
import static utils.FactorizationUtils.getNumber;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Problem005 {

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
}
