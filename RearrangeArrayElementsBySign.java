import java.util.*;

class RearrangeArrayElementsBySign {
    public static int[] rearrange(int[] arr, int n) {
        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];
        int[] res = new int[n];

        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                pos[x++] = arr[i];
            } else {
                neg[y++] = arr[i];
            }
        }
        x = 0;
        y = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                res[i] = pos[x++];
            } else {
                res[i] = neg[y++]; // Corrected this line to use the 'neg' array
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Get the rearranged array
        int[] ans = rearrange(arr, n); // Defined 'ans'

        // Print the rearranged array
        for (int ele : ans) {
            System.out.print(ele + " "); // Added space for better readability
        }
        System.out.println(); // To print a newline at the end
    }
}
