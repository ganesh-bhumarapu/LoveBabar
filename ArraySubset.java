import java.util.*;
class ArraySubset{
    public static String isSubset(long[] a1, long[] a2, long n, long m){
        Map<Long, Long> mp = new HashMap<>();

        // Count occurrences of each element in a1
        for (long num : a1) {
            mp.put(num, mp.getOrDefault(num, 0L) + 1);
        }

        // Check each element in a2
        for (long num : a2) {
            // Check if the current element in a2 is present in the map
            if (!mp.containsKey(num) || mp.get(num) == 0) {
                return "No";  // If not found or count is zero, return "No"
            }
            // Decrement the count of the current element
            mp.put(num, mp.get(num) - 1);
        }
        return "Yes";  // All elements in a2 are found in a1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();  // Change to long to match method signature
        long[] a1 = new long[(int) n];
        long[] a2 = new long[(int) m];

        // Read elements for a1
        for (int i = 0; i < n; i++) {
            a1[i] = sc.nextLong();
        }
        // Read elements for a2
        for (int i = 0; i < m; i++) {
            a2[i] = sc.nextLong();
        }

        System.out.println(isSubset(a1, a2, n, m));
    }
}