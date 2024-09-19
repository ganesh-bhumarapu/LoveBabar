import java.util.*;
class MergeSortedArray{
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int p1 = m -1;
        int p2 = n - 1;
        int p = m + n - 1;
        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] < nums2[p2]){
                nums1[p] = nums2[p2];
                p2--;
            }else{
                nums1[p] = nums1[p1];
                p1--;
            }
            p--;
        }
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] nums1 = new int[m];
        int[] nums2 = new int[n];
        for(int i = 0; i < m; i++){
            nums1[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            nums2[i] = sc.nextInt();
        }
        merge(nums1, m, nums2, n);
        for(int num : nums1){
            System.out.print(num + " ");
        }
    }
}