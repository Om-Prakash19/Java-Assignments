/*
 * Question : Given an array where all its elements are sorted in increasing order except two swapped
elements, sort it in linear time. Assume there are no duplicates in the array.
Input :  arr[] = [3, 8, 6, 7, 5, 9, 10]  
Output :  arr[] = [3, 5, 6, 7, 8,9,10]
 */

import java.util.*;

public class Question1 {
    public static void sortArray(int[] arr) {
        int n = arr.length;
        if (n <= 0)
            return;

        int x = -1, y = -1;
        int prev = arr[0];
        for (int i = 1; i < n; i++) {
            if (prev > arr[i]) {
                if (x == -1) {
                    x = i - 1;
                    y = i;
                } else {
                    y = i;
                }
            }
            prev = arr[i];
        }

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 3, 5, 6 };
        sortArray(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
