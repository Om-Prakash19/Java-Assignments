/*Question : Given a number. Using bit manipulation, check whether it is odd or even
 * 
 */

package NumberSystemAssignment;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if ((num & 1) == 0) {
            System.out.println("Your number " + num + " is even");
        } else {
            System.out.println("Your number " + num + " is odd");
        }
    }
}
