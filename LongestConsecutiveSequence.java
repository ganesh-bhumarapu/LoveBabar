import java.util.*;
class LongestConsecutiveSequence{
    // TC -> O(N) AND SC -> O(N)
    public static int longestSequence(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums){
            set.add(ele);
        }
        int longestSeq = 0;
        for(int num : set){
            int curr = num;
            int currSeq = 1;

            while(set.contains(curr + 1)){
                curr++;
                currSeq++;
            }
            longestSeq = Math.max(currSeq, longestSeq);
        }
        return longestSeq;
    }
    // TC -> O(NlogN) SC -> O(N)
//    Arrays.sort(arr);
//    int count = 1;
//    int maxCount = 1;
//	   for(int i = 1; i < N; i++){
//        if(arr[i] - arr[i - 1] == 1){
//            count++;
//        }else if (arr[i] == arr[i - 1]){
//            continue;
//        }
//        else{
//            maxCount = Math.max(count, maxCount);
//            count = 1;
//        }
//    }
//    maxCount = Math.max(count, maxCount);
//	   return maxCount;
//}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(longestSequence(nums));
    }
}