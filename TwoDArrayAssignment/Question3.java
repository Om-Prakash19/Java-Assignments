/*
 * Question -->  write a program to print the elements of both the diagonals in a user inputted square matrix in any order.	
 * 
 * Answer : 
 */

package TwoDArrayAssignment;
import java.util.Scanner;
public class Question3 {
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

        System.out.println("Elements of primary and secondary diagonal is : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if((i==j) || ((i+j)==(n-1)))
                {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

        scan.close();
    }
}
