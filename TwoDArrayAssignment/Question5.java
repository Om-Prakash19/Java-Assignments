/*
 * Question : Write a function which accepts a 2D array of integers and its size as arguments and displays the elements of middle row and the elements of middle column. Printing can be done in any order.
   [Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 etc...]

   Answer : 
 */

package TwoDArrayAssignment;

import java.util.Scanner;

public class Question5 {

    static void print(int arr[][], int n) {

        System.out.println("Elements present in the middle row and middle column is : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == (n / 2)) || (j == (n / 2))) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        System.out.print("Enter order of a square matrix (odd order starting from 3) : ");
        n = scan.nextInt();

        int arr[][] = new int[n][n];

        System.out.println("Enter " + n * n + " elements of a matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        print(arr, n);

        scan.close();
    }
}
