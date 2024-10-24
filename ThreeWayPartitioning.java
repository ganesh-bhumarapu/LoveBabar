import java.util.*;
class ThreeWayPartitioning {
    public static void threewayPartitioning(int[] arr, int a, int b) {

        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid <= high) {
            if (arr[mid] < a) {
                swap(arr, mid, high);
                low++;
                mid++;
            } else if (arr[mid] > b) {
                swap(arr, mid, high);
                high--;
            } else {
                mid++;
            }
        }
    }
    private static void swap(int[] arr, int low, int high){
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        threewayPartitioning(arr, a, b);
        for (int ele : arr) {
            System.out.print(ele);
        }
    }
}