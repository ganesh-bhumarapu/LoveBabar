import java.util.*;
class JumpGame{
    public static boolean isjumpPossible(int[] nums){
        int current = 0;
        int farthest = 0;
        if(nums.length == 1){
            return true;
        }
        for(int i = 0; i < nums.length - 1; i++){
            farthest = Math.max(farthest, nums[i] + i);
            if(i == current){
                if(farthest < i){
                    return false;
                }
                current = farthest;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        boolean res = isjumpPossible(nums);
        System.out.println(res);
    }
}