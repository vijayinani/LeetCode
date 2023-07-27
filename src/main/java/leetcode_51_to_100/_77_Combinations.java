package leetcode_51_to_100;

import java.util.ArrayList;
import java.util.List;

public class _77_Combinations {
    public static void main(String[] args) {
        System.out.println(new _77_Combinations().combine(3, 2));
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, n, k, 1, new ArrayList<>());
        return result;
    }

    private void backtrack(List<List<Integer>> result, int n, int k, int i, List<Integer> tempList) {
        if (k == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        for (; i <= n; i++) {
            tempList.add(i);
            backtrack(result, n, k - 1, i + 1, tempList);
            tempList.remove(tempList.size() - 1);
        }
    }
}
