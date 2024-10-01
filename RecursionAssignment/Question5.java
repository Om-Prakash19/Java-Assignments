/*Question :  Given a number n. Print if it is an armstrong number or not. 
 * 
 */

package RecursionAssignment;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        int digits = countDigits(number);
        
        if (isArmstrong(number, digits) == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static int countDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + countDigits(n / 10);
    }

    public static int isArmstrong(int n, int digits) {
        if (n == 0) {
            return 0;
        }
        int digit = n % 10;
        return (int) Math.pow(digit, digits) + isArmstrong(n / 10, digits);
    }
}
