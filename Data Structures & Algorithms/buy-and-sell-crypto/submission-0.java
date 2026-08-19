class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int buy=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>buy){
             profit=prices[i]-buy;
               max=Math.max(max,profit);
            }else{
                buy=prices[i];
            }
        }
        return max;
    }
}
