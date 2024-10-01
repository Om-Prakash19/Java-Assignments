/*Question :  Print the max value of the array [ 13, 1, -3, 22, 5].
 * 
 */

package RecursionAssignment;

public class Question3 {
    public static void main(String[] args) {
        int[] array = { 13, 1, -3, 22, 5 };
        int max = findMax(array, array.length);
        System.out.println("The maximum value in the array is: " + max);
    }

    public static int findMax(int[] array, int n) {
        if (n == 1) {
            return array[0];
        }
    
        return Math.max(array[n - 1], findMax(array, n - 1));
    }
}
