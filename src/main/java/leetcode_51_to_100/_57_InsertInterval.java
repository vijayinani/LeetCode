package leetcode_51_to_100;

import java.util.ArrayList;
import java.util.List;

public class _57_InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        boolean newIntervalUsed = false;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][1] < newInterval[0]) {
                result.add(intervals[i]);
            } else if (intervals[i][0] > newInterval[1]) {
                if (!newIntervalUsed) {
                    result.add(newInterval);
                    newIntervalUsed = true;
                }
                result.add(intervals[i]);
            } else {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
        }
        if (!newIntervalUsed) {
            result.add(newInterval);
        }
        return result.toArray(new int[result.size()][]);
    }
}
