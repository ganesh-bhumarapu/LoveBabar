import java.util.*;
class TrappingRainWater{
    public static long trappingWater(int arr[]) {
        // Your code here
        int n = arr.length;
        int leftMax = 0;
        int rightMax = 0;
        int total = 0;
        int l = 0;
        int r = n -1;

        while(l < r){
            if(arr[l] <= arr[r]){
                if(leftMax > arr[l]){
                    total += leftMax - arr[l];
                }else{
                    leftMax = arr[l];
                }
                l++;
            }else{
                if(rightMax > arr[r]){
                    total += rightMax - arr[r];
                }else{
                    rightMax = arr[r];
                }
                r--;
            }
        }
        return total;
    }
//    int n = arr.length;
//
//    int[] prefixMax = new int[n];
//    prefixMax[0] = arr[0];
//        for(int i = 1; i < n; i++){
//        prefixMax[i] = Math.max(prefixMax[i - 1], arr[i]);
//    }
//
//    int[] suffixMax = new int[n];
//    suffixMax[n - 1] = arr[n - 1];
//        for(int i = n - 2; i >= 0; i--){
//        suffixMax[i] = Math.max(suffixMax[i + 1], arr[i]);
//    }
//
//    int total = 0;
//
//        for(int i = 0; i < n; i++){
//        int leftMax = prefixMax[i];
//        int rightMax = suffixMax[i];
//
//        if(arr[i] < leftMax && arr[i] < rightMax){
//            total += Math.min(leftMax, rightMax) - arr[i];
//        }
//    }
//        return total;
//}
//}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(trappingWater(arr));
    }
}