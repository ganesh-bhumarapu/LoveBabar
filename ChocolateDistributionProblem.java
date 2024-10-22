import java.util.*;
class ChocolateDistributionProblem{
    public static int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        int ans = Integer.MAX_VALUE;
        Collections.sort(arr);

        for(int i = 0; i < arr.size(); i++){
            if(i + m <= arr.size()){
                ans = Math.min(ans, (arr.get(i + (m - 1)) - arr.get(i)));
            }else{
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int ele = sc.nextInt();
            arr.add(ele);
        }
        int m = sc.nextInt();
        System.out.println(findMinDiff(arr, m));
    }
}