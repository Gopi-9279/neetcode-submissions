class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int cp = Integer.MAX_VALUE;
        for(int i = 0 ; i < prices.length ; i++){
            int sp = prices[i];
            cp = Math.min(cp,sp);
            profit = Math.max(profit,sp-cp);
        }
        return profit;
    }
}
