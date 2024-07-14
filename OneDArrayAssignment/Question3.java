/*
 * Question --> Write a program to calculate maximum element in the array.
 * 
 * Answer : 
 */

package OneDArrayAssignment;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of the array : ");
        int n = scan.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element in the array is : " + max);

        scan.close();
    }
}
