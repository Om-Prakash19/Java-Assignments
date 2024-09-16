/*Question : Given a number, print its binary representation.
 * 
 */

package NumberSystemAssignment;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = scan.nextInt();

        String binary = Integer.toBinaryString(num);
        System.out.println("Binary representation of " + num + " is " + binary);
    }
}
