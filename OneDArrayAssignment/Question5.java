/*
 * Question --> Given an array find the first peak element in the array.
 * 
 * Answer : 
 */

package OneDArrayAssignment;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        int n = scan.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int firstPeak = 0;

        for (int i = 0; i < n; i++) {
            if ((i - 1) >= 0 && (i + 1) < n) {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    firstPeak = arr[i];
                    break;
                }
            }
        }

        if (firstPeak == 0) {
            System.out.println("There is no peak element in the array");
        } else {
            System.out.println("First peak element in the given array is : " + firstPeak);
        }

        scan.close();
    }
}
