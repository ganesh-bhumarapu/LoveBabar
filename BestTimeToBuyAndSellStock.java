import java.util.*;
class BestTimeToBuyAndSellStock{
    public static int maximumProfit(int[] prices){
        int maxPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < maxPrice){
                maxPrice = prices[i];
            }
            else{
                int profit = prices[i] -maxPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i = 0; i < n; i++){
            prices[i] = sc.nextInt();
        }
        System.out.println(maximumProfit(prices));
    }
}