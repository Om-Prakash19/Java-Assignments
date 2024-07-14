/*
 * Question --> Write a program to traverse over the elements of the array using for each loop and print all even elements.
 * 
 * Answer : 
 */

package OneDArrayAssignment;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        int n = scan.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("Your array is(using foreach loop) : ");
        for (int m : arr) {
            System.out.print(m + " ");
        }

        System.out.println();

        System.out.print("Even elements in given array is : ");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        scan.close();

    }
}
