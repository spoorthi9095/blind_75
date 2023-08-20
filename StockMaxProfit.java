public class StockMaxProfit {
    public static int maxProfit(int[] prices) {

        int low=prices[0],sell=0, profit = 0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<low){
                low = prices[i];
                sell = prices[i];
            }
            if(prices[i]>sell)
                sell = prices[i];

            if(profit<(sell - low))
                profit = sell - low;
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{2,4,1};
        System.out.println(maxProfit(prices));
    }
}
