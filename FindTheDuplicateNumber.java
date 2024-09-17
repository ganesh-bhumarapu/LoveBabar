import java.util.*;
class FindTheDuplicateNumber{
    public static int getDuplicate(int[] nums){
        boolean[] vis = new boolean[nums.length];
        for(int i : nums){
            if(vis[i] == true){
                return i;
            }else{
                vis[i] = true;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(getDuplicate(nums));
    }
}