/*Question : Given an sorted integer array containing duplicates , count occurence of a given number . If the element is not found in the array , report as well.

Answer :
 * 
 */

package SearchingAssignment;

import java.util.*;
import java.io.*;

public class Question4 {

    public static int numOfOccurence(int arr[], int target) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 2, 5, 5, 6, 6, 6, 8, 9, 9, 9 };

        System.out.println("Enter element whose number of occurence you want to find out : ");
        int target = sc.nextInt();

        int result = numOfOccurence(arr, target);

        if (result == 0) {
            System.out.println("element not found in the array");
        } else {
            System.out.println("Target " + target + " occurs " + result + " times");
        }

    }
}
