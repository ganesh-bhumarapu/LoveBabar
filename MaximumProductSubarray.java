import java.util.*;
class MaximumProductSubarray{
    public static long maxProduct(int[] arr){
        int ans = 1;
        int max = Integer.MIN_VALUE;

        for(int i : arr) {
            ans *= i;
            max = Math.max(max, ans);
            if (ans == 0) {
                ans = 1;
            }
        }
        ans = 1;
        for(int i = arr.length - 1; i >= 0; i++){
            ans *= arr[i];
            max = Math.max(max, ans);
            if(ans == 0){
                ans = 1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxProduct(arr));
    }
}