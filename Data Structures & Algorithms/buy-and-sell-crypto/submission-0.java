class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxPrice = 0;

        for (int sell : prices) {
            maxPrice = Math.max(maxPrice, sell- minPrice);
            minPrice = Math.min(sell, minPrice);
        }
        return maxPrice;
    }
}
