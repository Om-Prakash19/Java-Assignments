/*
 * Question --> Write a program to find out the second largest element in a given array.
 * 
 * Answer : 
 */

package OneDArrayAssignment;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        int n = scan.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int largest = 0, secondLargest = 0;
        for (int i = 0; i < n; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (largest > arr[i]) {
                if (secondLargest < arr[i]) {
                    secondLargest = arr[i];
                }
            }
        }

        System.out.println("Second largest number of the array is : " + secondLargest);

        scan.close();

    }
}
