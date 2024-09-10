import java.util.*;
class IntersectionOfTwoArrays{
    public static int[] intersection(int[] nums1, int[] nums2){
        int n1 = nums1.length;
        int n2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        Set<Integer> set = new HashSet<>();
        while(i < n1 && j < n2){
            if(nums1[i] == nums2[j]){
                set.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        int[] ans = new int[set.size()];
        int x = 0;
        for(Integer ele : set){
            ans[x++] = ele;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] nums1 = new int[n1];
        int[] nums2 = new int[n2];
        for(int i = 0; i < n1; i++){
            nums1[i] = sc.nextInt();
        }
        for(int i = 0; i < n2; i++){
            nums2[i] = sc.nextInt();
        }
    }
}