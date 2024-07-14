/*
 * Question --> write a program to print the elements above the secondary diagonal in a user inputed square matrix.
 * 
 * 
 * Answer : 
 */

package TwoDArrayAssignment;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        System.out.print("Enter order of a square matrix : ");
        n = scan.nextInt();

        int arr[][] = new int[n][n];

        System.out.println("Enter " + n * n + " elements of a matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("Elements above the secondary diagonal of a matrix is : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) < (n - 1)) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

        scan.close();
    }
}
