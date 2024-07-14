/*
 * Question -->  Write a program to find the largest element of a given 2D array of integers. 
 * 
 * Answer : 
 */

package TwoDArrayAssignment;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m, n;

        System.out.print("Enter the number of rows in matrix : ");
        m = scan.nextInt();
        System.out.print("Enter the number of columns in matrix : ");
        n = scan.nextInt();

        int arr[][] = new int[m][n];

        System.out.println("Enter " + m * n + " elements : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        int largest = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > largest) {
                    largest = arr[i][j];
                }
            }
        }

        System.out.println("Largest element in given 2D array is : " + largest);

        scan.close();

    }
}
