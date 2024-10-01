/*Question : Given an integer , find out the sum of its digits using recursion
 * 
 * Answer : 
 */

package RecursionAssignment;

import java.util.*;

public class Question1 {

    public static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }

        return num % 10 + sumOfDigits(num / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int result = sumOfDigits(num);
        System.out.println("Sum of digits of " + num +" is " + result);
    }
}
