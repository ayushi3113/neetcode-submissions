class Solution {
    public int maxProfit(int[] prices) {
        int buy=0,sell=1;
        int n = prices.length;
        int profit = 0;
        while(sell<n){
            if(prices[buy]<prices[sell]){
                profit = Math.max(profit,prices[sell]-prices[buy]);
            }
            else{
                buy = sell;
            }
            sell++;
        }
        return profit;
    }
}
