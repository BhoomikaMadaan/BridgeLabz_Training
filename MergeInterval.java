import java.util.*;

public class MergeInterval {

    public static void main(String[] args) {

        /*
         * GIVEN INTERVALS:
         * [1,3] and [2,6] overlap
         * so they become [1,6]
         * 
         * FINAL OUTPUT:
         * [1,6]
         * [8,10]
         * [15,18]
         */

        int intervals[][] = {
                { 1, 3 },
                { 2, 6 },
                { 8, 10 },
                { 15, 18 }
        };

        /*
         * CONCEPT LEARNT:
         * -> Arrays.sort()
         * -> Lambda Expression
         * -> Sorting 2D Arrays
         * 
         * We sort intervals based on starting value.
         * 
         * a[0] = starting value of first interval
         * b[0] = starting value of second interval
         */

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        /*
         * ArrayList<int[]>
         * stores merged intervals.
         */

        ArrayList<int[]> ans = new ArrayList<>();

        /*
         * start and end represent current interval.
         */

        int start = intervals[0][0];
        int end = intervals[0][1];

        /*
         * Start checking from second interval
         * because first interval is already stored
         * in start and end.
         */

        for (int i = 1; i < intervals.length; i++) {

            /*
             * CONDITION FOR OVERLAP:
             * 
             * if next interval's start <= current end
             * 
             * Example:
             * Current -> [1,3]
             * Next -> [2,6]
             * 
             * Since 2 <= 3
             * they overlap.
             */

            if (intervals[i][0] <= end) {

                /*
                 * Merge intervals by taking maximum end.
                 * 
                 * max(3,6) = 6
                 */

                end = Math.max(end, intervals[i][1]);
            }

            else {

                /*
                 * No overlap found.
                 * 
                 * Store previous merged interval.
                 */

                ans.add(new int[] { start, end });

                /*
                 * Start new interval.
                 */

                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        /*
         * VERY IMPORTANT:
         * 
         * Last interval is never added inside loop.
         * 
         * So we add it manually after loop.
         * 
         * COMMON BEGINNER MISTAKE:
         * Forgetting this final add statement.
         */

        ans.add(new int[] { start, end });

        System.out.println("Merged Intervals:");

        /*
         * Enhanced for loop
         * used to print intervals.
         */

        for (int arr[] : ans) {

            System.out.println("[" + arr[0] + "," + arr[1] + "]");
        }
    }
}