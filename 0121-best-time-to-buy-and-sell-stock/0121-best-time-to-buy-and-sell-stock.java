class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int stock = prices[0];
        for(int i=0; i<prices.length; i++){
            if(stock>prices[i]){
                stock = prices[i];
            }
            int diff = prices[i]-stock;
            max = Math.max(max, diff);
            }
        
        return max;
    }
}