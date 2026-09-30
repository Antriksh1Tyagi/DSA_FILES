class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) return 0;

        int low = prices[0]; 
        int Profit = 0;

     
        for (int i = 0; i < n; i++) {
       
            if (prices[i] < low) {
                low = prices[i];
            }
            
           
            if (prices[i] - low > Profit) {
                Profit = prices[i] - low;
            }
        }
        
        return Profit;  
    }
}