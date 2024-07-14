/*
 * Question --> Write a program to print the sum of all the elements present on even indices in the given array.
 * 
 * Answer : 
 */

package OneDArrayAssignment;

import java.util.Scanner;

public class Question1 {
   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      System.out.print("Enter the length of the array : ");
      int n = scan.nextInt();

      int arr[] = new int[n];

      System.out.println("Enter " + n + " elements : ");
      for (int i = 0; i < n; i++) {
         arr[i] = scan.nextInt();
      }

      int sum = 0;
      for (int i = 0; i < n; i++) {
         if (i % 2 == 0) {
            sum += arr[i];
         }
      }

      System.out.println("Sum of elements present in the even indices in the given array is : " + sum);

      scan.close();
   }
}