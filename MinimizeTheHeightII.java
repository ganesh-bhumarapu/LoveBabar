import java.util.*;
class MinimizeTheHeightII{
    public static int mindiff(int[] arr, int n, int k){
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[n - 1];
        int res = 0;
        for(int i = 1; i < n; i++){
            min = Math.min(arr[i] - k, arr[i - 1] + k);
            max = Math.max(arr[i - 1] + k, arr[n - 1] - k);
            if(min < 0) continue;// there is no point of taking negitive height difference into consideration

            res = Math.min(res, max - min);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = sc.nextInt();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(mindiff(arr, n, k));
    }
}