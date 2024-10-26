/*Question :  Given an integer array arr, print all the possible permutations of the given array.
 * 
 */

package BacktrackingAssignment;

import java.util.*;

public class Question2 {
    private static void printPermutations(int[] arr, int start) {
        if (start == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = start; i < arr.length; i++) {
            swap(arr, start, i);
            printPermutations(arr, start + 1);
            swap(arr, start, i);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println("All possible permutations : ");
        printPermutations(arr, 0);
    }
}
