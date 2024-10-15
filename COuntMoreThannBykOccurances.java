import java.util.*;
class COuntMoreThannBykOccurances
{
    public static int countOccurence(int[] arr, int n, int k)
    {
        Map<Integer, Integer> mp = new HashMap<>();
        int count = 0;
        for(int i = 0; i < n; i++){
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        for(Integer value : mp.values()){
            if(value > n/ k){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = sc.nextInt();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(countOccurence(arr, n, k));
    }
}