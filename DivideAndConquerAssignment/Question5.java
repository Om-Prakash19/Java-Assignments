/*
 * Question :  An interval is represented as a combination of start time and end time. Given a set of
intervals, check if any two intervals intersect
Input : arr[] = {{1, 3}, {5, 7}, {2, 4}, {6, 8}}
Output : Yes
The intervals {1, 3} and {2, 4} overlap
Input : arr[] = {{1, 3}, {7, 9}, {4, 6}, {10, 13}}
Output : No

 */

public class Question5 {
    static class Interval {
        int start, end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static boolean isIntersect(Interval[] arr, int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < arr[i].end) {
                max = arr[i].end;
            }
        }
        int aux[] = new int[max + 1];
        for (int i = 0; i < n; i++) {
            int x = arr[i].start;
            int y = arr[i].end;
            aux[x]++;
            aux[y]--;
        }
        for (int i = 1; i < aux.length; i++) {
            aux[i] += aux[i - 1];
            if (aux[i] > 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Interval[] arr = { new Interval(1, 3), new Interval(5, 7), new Interval(2, 4), new Interval(6, 8) };
        int n = arr.length;

        if (isIntersect(arr, n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
