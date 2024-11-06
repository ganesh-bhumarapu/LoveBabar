import java.util.*;
class PalindromicArray {
    public static boolean palinArray(int[] arr) {
        for (int ele : arr) {
            if (isPalindrome(ele) != 1) {
                return false;
            }
        }
        return true;
    }

    private static int isPalindrome(int ele) {
        int curr = ele;
        int rev = 0;
        while (ele != 0) {
            int rem = ele % 10;
            rev = rev * 10 + rem;
            ele /= 10;
        }
        if (curr == rev) return 1;

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(palinArray(arr));
    }
}