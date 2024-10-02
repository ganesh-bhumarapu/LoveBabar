import java.util.*;
class SubArrayWithZeroSum{
    //TC -> O(n) SC -> O(N)
    public static boolean subarrayZero(int[] arr){
        Set<Integer> st = new HashSet<>();
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(arr[i] == 0 || sum == 0 || st.contains(sum)){
                return true;
            }
            st.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(subarrayZero(arr));
    }
}