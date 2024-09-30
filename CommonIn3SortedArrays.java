import java.util.*;
class CommonIn3SortedArrays {
    public static List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0, k = 0;

        while (i < arr1.size() && j < arr2.size() && k < arr3.size()) {
            int ele1 = arr1.get(i);
            int ele2 = arr2.get(j);
            int ele3 = arr3.get(k);

            if (ele1 == ele2 && ele2 == ele3) {
                if (result.isEmpty() || result.get(result.size() - 1) != ele1) {
                    result.add(ele1);
                }
                i++;
                j++;
                k++;
            } else if (ele1 < ele2) {
                i++;
            } else if (ele2 < ele3) {
                j++;
            } else {
                k++;
            }
        }

        if (result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the first array
        System.out.println("Enter elements of the first sorted array (comma-separated): ");
        String[] input1 = sc.nextLine().split(",");
        List<Integer> nums1 = new ArrayList<>();
        for (String num : input1) {
            nums1.add(Integer.parseInt(num.trim()));
        }

        // Input for the second array
        System.out.println("Enter elements of the second sorted array (comma-separated): ");
        String[] input2 = sc.nextLine().split(",");
        List<Integer> nums2 = new ArrayList<>();
        for (String num : input2) {
            nums2.add(Integer.parseInt(num.trim()));
        }

        // Input for the third array
        System.out.println("Enter elements of the third sorted array (comma-separated): ");
        String[] input3 = sc.nextLine().split(",");
        List<Integer> nums3 = new ArrayList<>();
        for (String num : input3) {
            nums3.add(Integer.parseInt(num.trim()));
        }

        // Finding common elements
        List<Integer> res = commonElements(nums1, nums2, nums3);
        System.out.println("Common elements: " + res);
    }
}