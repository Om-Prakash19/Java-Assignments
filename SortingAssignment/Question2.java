/*Write a program to sort array in descending order using selection sort
 * 
 * Answer : 
 */

package SortingAssignment;

import java.util.*;
import java.io.*;

public class Question2 {

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int max_idx = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max_idx]) {
                    max_idx = j;
                }
                int temp = arr[max_idx];
                arr[max_idx] = arr[i];
                arr[i] = temp;

            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        selectionSort(arr);

        System.out.println("Your sorted array in descending order is : " + Arrays.toString(arr));
    }
}
