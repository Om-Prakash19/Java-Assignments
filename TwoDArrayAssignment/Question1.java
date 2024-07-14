/*
 * Question -->  Take m and n input from the user and m * n integer inputs from user and print the following:			
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0.

Answer : 
 */

package TwoDArrayAssignment;

import java.util.Scanner;

public class Question1 {
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

        int numOfPositive = 0, numOfNegative = 0, numOfOdd = 0, numOfEven = 0, numOfZero = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > 0) {
                    numOfPositive++;
                } else if (arr[i][j] < 0) {
                    numOfNegative++;
                } else {
                    numOfZero++;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] % 2 == 0) {
                    numOfEven++;
                } else {
                    numOfOdd++;
                }
            }
        }

        System.out.println("Number of positive numbers = " + numOfPositive);
        System.out.println("Number of negative numbers = " + numOfNegative);
        System.out.println("Number of odd numbers = " + numOfOdd);
        System.out.println("Number of even numbers = " + numOfEven);
        System.out.println("Number of 0 = " + numOfZero);

        scan.close();

    }
}
