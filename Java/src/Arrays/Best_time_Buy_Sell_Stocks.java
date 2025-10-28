package Arrays;

public class Best_time_Buy_Sell_Stocks {
    public static int maxProfit(int[] anyArray) {
        int maxProfit = 0; 
        int minValue = anyArray[0];
        for (int i=0; i<anyArray.length; i++){
            
            if (anyArray[i] < minValue){
                minValue = anyArray[i];
            }else {
                int profit = anyArray[i] - minValue;
                if (profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices [] = {7,1,5,3,6,4};
        int result = maxProfit(prices);
        System.out.println("The Maximum profit will be :"+ " "+ result);
    }
}
