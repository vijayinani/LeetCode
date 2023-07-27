package leetcode_51_to_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _56_MergeIntervals {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new _56_MergeIntervals().merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})));
    }

    public int[][] merge(int[][] intervals) {

        if (intervals.length < 2) {
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> result = new ArrayList<>();

        int[] currInterval = intervals[0];
        result.add(currInterval);
        for (int i = 1; i < intervals.length; i++) {
            if (currInterval[1] >= intervals[i][0]) {
                result.remove(result.size() - 1);
                currInterval[1] = Math.max(intervals[i][1], currInterval[1]);
                result.add(currInterval);
            } else {
                currInterval = intervals[i];
                result.add(currInterval);
            }
        }
        return result.toArray(new int[result.size()][]);

    }
}
