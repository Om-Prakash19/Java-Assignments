/*Question : Given an array nums of size n, return the majority element
 * 
 */

package HashMapAssignment;

import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int majority = -1;

        for (int i = 0; i < n; i++) {
            majority = Math.max(majority, arr[i]);
        }

        System.out.println("Majority element is : " + majority);
    }
}
