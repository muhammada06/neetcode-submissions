class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buy_price=prices[0];
       

        for (int p:prices){
            buy_price=Math.min(p,buy_price);
            profit=Math.max(profit,p-buy_price);

        }





return profit;
        
    }
}
