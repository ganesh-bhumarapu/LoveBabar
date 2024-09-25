// 1-> start iterating from the end and find the element which is greater then the current element on its right side
// 2-> store it in index if index is -1 then we have to return the complete reverse of the array as there is no further permutation for it
// 3 -> swap the index element which is just greater than it from the subarray which is present on its right side
// 4-> reverse the subarray which is on right of the index
import java.util.*;
class NextPermutation{
    public static void nextPermutation(int[] nums){
        int n = nums.length;
        int index = -1;
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverse(nums, 0, n);
            return;
        }
        for(int i = n - 1; i >= 0; i--){
            if(nums[i] > nums[index]){
                swap(nums, i, index);
                break;
            }
        }
        reverse(nums, index + 1, n);
    }
    private static void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    private static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        nextPermutation(nums);
        for(int ele : nums){
            System.out.print(ele);
        }
    }
}