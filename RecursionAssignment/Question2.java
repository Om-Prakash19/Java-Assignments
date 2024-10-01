/*Question : : Given a number n. Find the sum of natural numbers till n but with alternate signs
 * 
 */

package RecursionAssignment;

import java.util.*;

public class Question2 {

    public static int sumOfNumbers(int num) {
        if (num == 0) {
            return 0;
        }

        if (num % 2 == 0) {
            return sumOfNumbers(num - 1) - num;
        } else {
            return sumOfNumbers(num - 1) + num;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int result = sumOfNumbers(num);

        System.out.println("Required sum of numbers with alternate signs is : " + result);
    }
}
