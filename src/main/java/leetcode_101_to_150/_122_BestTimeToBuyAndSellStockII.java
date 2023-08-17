package leetcode_101_to_150;

public class _122_BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        System.out.println(new _122_BestTimeToBuyAndSellStockII().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = 0;
        int sell = 0;
        int i = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i + 1] <= prices[i]) i++;
            buy = prices[i];
            while (i < prices.length - 1 && prices[i + 1] > prices[i]) i++;
            sell = prices[i];
            maxProfit += sell - buy;
        }
        return maxProfit;
    }
}
