public class Stock_Max_Profit {

    public static int MaxStockProfit(int price[])
    {
        int profit=0,BuyPrice=price[0],CurrentProfit=0;
        for(int i=1;i<price.length;i++)
        {
            CurrentProfit=price[i]-BuyPrice;
            if(price[i]<BuyPrice)
                BuyPrice=price[i];
            profit=Math.max(CurrentProfit,profit);
        }
        return profit;
    }
    
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};              //5
        int[] prices1 = {7, 1, 5, 3, 6, 4};     //5
        int[] prices2 = {7, 6, 4, 3, 1};        //0
        int[] prices3 = {1, 2, 3, 4, 5};        //4
        int[] prices4 = {5, 4, 3, 2, 1};        //0
        int[] prices5 = {1};                    //0
        int[] prices6 = {};                     //0
        System.out.println("Max Profit : "+MaxStockProfit(price));
        System.out.println("Max Profit : "+MaxStockProfit(prices1));
        System.out.println("Max Profit : "+MaxStockProfit(prices2));
        System.out.println("Max Profit : "+MaxStockProfit(prices3));
        System.out.println("Max Profit : "+MaxStockProfit(prices4));
        System.out.println("Max Profit : "+MaxStockProfit(prices5));
        System.out.println("Max Profit : "+MaxStockProfit(prices6));
    }
}
