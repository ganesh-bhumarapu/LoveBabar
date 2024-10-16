import java.util.*;
class StockBuyAndSellAtMostTwoTransactios{
    public static int maxProfitAtmostTwoTransactions(int[] prices, int n){
        int[] dp = new int[n];
        int maxL = prices[n - 1];
        int minI = prices[0];

        for(int i = n - 2; i >= 0; i--){
            if(prices[i] > maxL){
                maxL = prices[i];
            }
            dp[i] = Math.max(dp[i + 1], maxL - prices[i]);
        }
        for(int i = 0; i < n; i++){
            if(prices[i] < minI){
                minI = prices[i];
            }
            dp[i] = Math.max(dp[i - 1], dp[i] + minI - prices[i]);
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i = 0; i < n; i++){
            prices[i] = sc.nextInt();
        }
        System.out.println(maxProfitAtmostTwoTransactions(prices, n));
    }
}