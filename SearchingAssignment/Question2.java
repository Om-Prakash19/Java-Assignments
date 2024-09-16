/*Question : Given an array and an integer "target" , return the last occurence of "target" in the array. If the target is not present return -1 
 * 
 */

package SearchingAssignment;

import java.util.*;
import java.io.*;

public class Question2 {

    public static int lastOccurence(int arr[], int target) {
        int low = 0, high = arr.length - 1, result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
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

        System.out.println("Enter the elemnt whose last occurence to to found out :");
        int target = sc.nextInt();

        int result = lastOccurence(arr, target);

        System.out.println((result));

    }
}
