/*Question : Given a number ‘n’, predict whether it is a power of two or not
 * 
 */

package NumberSystemAssignment;

import java.util.Scanner;

public class Question2 {

    public static boolean isPowerOfTwo(int num) {
        if (num <= 0) {
            return false;
        }

        return (num & (num - 1)) == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to be checked  : ");
        int num = sc.nextInt();

        System.out.println(isPowerOfTwo(num));
    }

}
