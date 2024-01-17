class Solution {
    public int maxProfit(int[] prices) {
//         int buy=Integer.MAX_VALUE;
//         int buyDay=0;
// //         Check minimum Buy
//         for(int i=0 ; i<prices.length ; i++) {
//             if(prices[i] < buy) {
//                 buy=prices[i];
//                 buyDay=i;
//             }
//         }
        
//         int sell=Integer.MIN_VALUE;
// //         Check sell
//         if(buyDay == prices.length-1) {
//             return 0;
//         }
//         for(int j=buyDay+1 ; j<prices.length ; j++) {
//             if(prices[j] > sell) {
//                 sell=prices[j];
//             }
//         }
//         return sell-buy;
        
        int buy_price=prices[0];
        int current_profit=0;
        int max_profit=0;
        
        for(int i=1 ; i<prices.length ; i++) {
            if(prices[i]<buy_price) {
                buy_price=prices[i];
            }
//             else {
                
//             }
            if(current_profit< prices[i]-buy_price) {
                current_profit = prices[i]-buy_price;
            }
            if(max_profit<current_profit) {
                max_profit=current_profit;
            }
        }
        
        return max_profit;
        
        
    }
}