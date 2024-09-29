import java.util.*;
class TwoSum{
    public static int[] twoSum(int[] nums, int target){
        int[] res = new int[2];
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(mp.containsKey(diff)){
                res[0] = mp.get(diff);
                res[1] = i;
            }
            mp.put(nums[i], i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(twoSum(nums, target));
    }
}