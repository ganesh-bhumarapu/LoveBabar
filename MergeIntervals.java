import java.util.*;

class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        int n = intervals.length;

        // Sort the intervals based on the start time
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // If the list is empty or the current interval does not overlap
            if (ans.isEmpty() || intervals[i][0] > ans.get(ans.size() - 1)[1]) {
                ans.add(new int[] { intervals[i][0], intervals[i][1] });
            }
            // If it overlaps, merge the intervals
            else {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], intervals[i][1]);
            }
        }

        // Convert List<int[]> to int[][]
        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Input a 2D array to represent intervals
        int[][] intervals = new int[n][2];
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt(); // start of interval
            intervals[i][1] = sc.nextInt(); // end of interval
        }

        // Call the merge function and store the result
        int[][] result = merge(intervals);

        // Print the merged intervals
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
