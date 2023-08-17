package leetcode_101_to_150;

public class _121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minBuyPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            minBuyPrice = Math.min(minBuyPrice, price);
            maxProfit = Math.max(maxProfit, price - minBuyPrice);
        }
        return maxProfit;
    }
}
