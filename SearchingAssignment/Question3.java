/*Question  : Given a sorted binary array , efficiently count the number of 1,s in it.

Answer : 
 * 
 */

package SearchingAssignment;

public class Question3 {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1 };

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                result++;
            }
        }

        System.out.println(result);

    }
}
