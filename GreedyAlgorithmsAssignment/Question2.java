
/*
 * Question :  You are given n activities with their start and finish times. Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time.
Input : start[]  =  {10, 12, 20}, finish[] =  {20, 25, 30}
Output : 0 2
Explanation : A person can perform at most two activities. The maximum set of activities that can be executed is {0, 2} [ These are indexes in start[] and finish[] ]
 */
import java.util.*;

public class Question2 {
    public static void selectActivities(int[] start, int[] finish, int n) {
        int[][] activities = new int[n][3];
        for (int i = 0; i < n; i++) {
            activities[i][0] = start[i];
            activities[i][1] = finish[i];
            activities[i][2] = i;
        }

        Arrays.sort(activities, Comparator.comparingInt(a -> a[1]));
        List<Integer> selected = new ArrayList<>();
        selected.add(activities[0][2]);
        int lastFinish = activities[0][1];

        for (int i = 1; i < n; i++) {
            if (activities[i][0] >= lastFinish) {
                selected.add(activities[i][2]);
                lastFinish = activities[i][1];
            }
        }

        System.out.println(selected);

    }

    public static void main(String[] args) {
        int[] start = { 10, 12, 20 };
        int[] finish = { 20, 25, 30 };

        selectActivities(start, finish, start.length);
    }
}
