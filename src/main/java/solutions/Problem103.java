package solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Problem103 {

    public int solve() {
        int[] indices = { 0, 1, 2, 3, 4, 5, 6 };
        List<Set<Integer>> subsets = getAllSubsets(indices);
        for (int i = 0; i < subsets.size(); i++) {
            Set<Integer> subset1 = subsets.get(i);
            if (!subset1.isEmpty()) {
                for (int j = 0; j < subsets.size(); j++) {
                    Set<Integer> subset2 = subsets.get(j);
                    if (!subset2.isEmpty() && isDisjointSubsets(subset1, subset2)) {
                        System.out.println(subset1 + " " + subset2);
                    }
                }
            }
        }
        return 0;
    }

    private List<Set<Integer>> getAllSubsets(int[] set) {
        List<Set<Integer>> subsets = new ArrayList<>();
        int length = set.length;
        for (int i = 0; i < (1 << length); i++) {
            Set<Integer> subset = new TreeSet<>();
            for (int j = 0; j < length; j++) {
                if ((i & (1 << j)) > 0) {
                    subset.add(set[j]);
                }
            }
            subsets.add(subset);
        }
        return subsets;
    }

    private boolean isDisjointSubsets(Set<Integer> subset1, Set<Integer> subset2) {
        for (int item : subset1) {
            if (subset2.contains(item)) {
                return false;
            }
        }
        return true;
    }
}
