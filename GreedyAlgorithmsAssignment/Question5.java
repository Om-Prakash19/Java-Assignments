/*
 * Question  : Given an array of intervals where intervals[i] = [starti, endi], return the minimum number of
intervals you need to remove to make the rest of the intervals non-overlapping.
Input : intervals = [[1,2],[2,3],[3,4],[1,3]]
Output : 1
Explanation : [1,3] can be removed and the rest of the intervals are non-overlapping
 */

import java.util.*;

public class Question5 {
    public static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0)
            return 0;

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

        int nonOverlappingCount = 1;
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= end) {
                nonOverlappingCount++;
                end = intervals[i][1];
            }
        }

        return intervals.length - nonOverlappingCount;
    }

    public static void main(String[] args) {
        int[][] intervals = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 1, 3 } };

        System.out.println(eraseOverlapIntervals(intervals));
    }
}
