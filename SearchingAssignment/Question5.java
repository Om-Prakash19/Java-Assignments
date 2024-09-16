/*Question : Given a positive num  , return true if num is a perfect squareroot or false otherwise
 * 
 */

package SearchingAssignment;

import java.util.*;
import java.io.*;

public class Question5 {

    public static boolean squareRoot(int target) {
        int low = 0, high = target;
        boolean answer = false;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long val = mid * mid;

            if (val == target) {
                return true;
            } else if (val < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number which you want to check is a perfect squareroot or not : ");
        int target = sc.nextInt();

        System.out.println(squareRoot(target));
    }
}
