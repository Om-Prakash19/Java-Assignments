/*Question : Given a number, count the number of set bits in that number without using an extra space
 * 
 */

package NumberSystemAssignment;

import java.util.Scanner;

public class Question4 {

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int count = countSetBits(num);

        System.out.println("Number of set bits in " + num + " is " + count);
    }
}
