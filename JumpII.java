import java.util.*;
class JumpII{
    public static int minJumps(int[] nums){
        int current = 0;
        int farthest = 0;
        int jumps = 0;
        if(nums.length == 1){
            return 0;
        }
        for(int i = 0; i < nums.length - 1; i++){
            farthest = Math.max(farthest, nums[i] + i);
            if(i == current){
                if(farthest < i){
                    return -1;
                }
                current = farthest;
                jumps++;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(minJumps(nums));
    }
}