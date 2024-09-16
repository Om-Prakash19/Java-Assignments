/*Question  :  Given an integer array, duplicates are present in it in a way that all duplicates appear an even
number of times except one which appears an odd number of times. Find that odd appearing
element in linear time and without using any extra memory
 * 
 */

package NumberSystemAssignment;

public class Question5 {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3 };
        System.out.println("The odd occurring element is " + findOddOccurring(arr));
    }

    public static int findOddOccurring(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }
}
