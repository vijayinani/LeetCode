package leetcode_51_to_100;

import java.util.ArrayList;
import java.util.List;

public class _54_SpiralMatrix {
    public static void main(String[] args) {
        System.out.println(new _54_SpiralMatrix().spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        System.out.println(new _54_SpiralMatrix().spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}));
    }

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>(matrix.length * matrix[0].length);

        int lowM = 0;
        int lowN = 0;
        int highM = matrix.length - 1;
        int highN = matrix[0].length - 1;
        String nextCase = "TOP_LEFT";

        while (lowM <= highM && lowN <= highN) {

            switch (nextCase) {
                case "TOP_LEFT":
                    for (int i = lowN; i <= highN; i++) {
                        result.add(matrix[lowM][i]);
                    }
                    lowM++;
                    nextCase = "TOP_RIGHT";
                    break;

                case "TOP_RIGHT":
                    for (int i = lowM; i <= highM; i++) {
                        result.add(matrix[i][highN]);
                    }
                    highN--;
                    nextCase = "BOTTOM_RIGHT";
                    break;

                case "BOTTOM_RIGHT":
                    for (int i = highN; i >= lowN; i--) {
                        result.add(matrix[highM][i]);
                    }
                    highM--;
                    nextCase = "BOTTOM_LEFT";
                    break;

                case "BOTTOM_LEFT":
                    for (int i = highM; i >= lowM; i--) {
                        result.add(matrix[i][lowN]);
                    }
                    lowN++;
                    nextCase = "TOP_LEFT";
                    break;
            }
        }
        return result;
    }
}
