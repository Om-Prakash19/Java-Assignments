/* Question : Given an array. Find the number X in the array. If the element is present , return the index of the element , else print "Element not found in array".  Input the size of array , array from the user and the element X from user.Use Linear search to find the element.
*
Answer : 
 */

package SearchingAssignment;

import java.util.*;
import java.io.*;

public class Question1 {

    public static int linearSearch(int arr[], int target) {
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be searched :");
        int target = sc.nextInt();

        int result = linearSearch(arr, target);

        if (result != -1) {
            System.out.println("Element is present at index number " + result);
        } else {
            System.out.println("Element not found in array");
        }
    }
}