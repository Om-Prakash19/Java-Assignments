/*Question : Find the sum of the values of the array [92, 23, 15, -20, 10]
 * 
 */

package RecursionAssignment;

public class Question4 {

    public static int sumOfArray(int arr[], int n) {
        if (n == 0) {
            return 0;
        }

        return arr[n - 1] + sumOfArray(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 92, 23, 15, -20, 10 };

        int result = sumOfArray(arr, arr.length);

        System.out.print("Sum of the values of the array is : " + result);
    }
}
