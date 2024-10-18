import java.util.*;
class TripletSunInArray{
    public static boolean triplet(int[] arr, int n, int x){
        Arrays.sort(arr);
        for(int i = 0; i < n - 2; i++){
            int s = x - arr[i];
            int j = i + 1;
            int k = n - 1;
            while(j < k){
                if(arr[j] + arr[k] == s){
                    return true;
                }else if(arr[j] + arr[k] < s){
                    j--;
                }else{
                    k++;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(triplet(arr, n, x));
    }
}