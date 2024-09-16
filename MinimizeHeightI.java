import java.util.*;
class MinimizeHeightI{
    public static int getminDifference(int[] arr, int n, int k){
        Arrays.sort(arr);
        int max = arr[n - 1];
        int min = arr[0];
        int res = max - min;

        for(int i = 0; i < n; i++){
            min = Math.min(arr[0] + k, arr[i] + k);
            max = Math.max(arr[n - 1] - k, arr[i - 1] + k);
            res = Math.min(res, max - min);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(getminDifference(arr, n, k));
    }
}