import java.util.*;
class SmallestSubarayWithSumGreaterThanX {
    public static int smallestSubWithSum(int x, int[] arr) {
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        while (end < arr.length) {
            sum += arr[end];
            if (arr[end] > x) {
                return 1;
            }
            while (sum > x) {
                minLength = Math.min(minLength, end - start + 1);
                sum -= arr[start];
                start++;
            }
            end++;
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    //    public static int smallestSubWithSum(int x, int[] arr) {
//            // Your code goes here
//            int i = 0;
//            int sum = 0;
//            int ans = Integer.MAX_VALUE;
//            while(i < arr.length){
//                int j =  i + 1;
//                sum = arr[i];
//                if (sum > x) {
//                    return 1;
//                }
//                while(sum <= x && j < arr.length){
//                    sum += arr[j];
//                    if(sum > x){
//                        ans = Math.min(ans, j - i + 1);
//                    }
//                    j++;
//                }
//                i++;
//            }
//            return ans == Integer.MAX_VALUE ? 0 : ans;
//        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(smallestSubWithSum(x, arr));
    }
}