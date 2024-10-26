/*Question :  Check if the product of some subset of an array is equal to the target value.
 * 
 */

package BacktrackingAssignment;

public class Question4 {
    public static boolean isProductSubset(int[] arr, int target) {
        return backtrack(arr, target, 1, 0);
    }

    public static boolean backtrack(int[] arr, int target, int currentProduct, int index) {
        if (currentProduct == target) {
            return true;
        }

        if (currentProduct > target || index >= arr.length) {
            return false;
        }

        boolean includeCurrent = backtrack(arr, target, currentProduct * arr[index], index + 1);

        boolean excludeCurrent = backtrack(arr, target, currentProduct, index + 1);

        return includeCurrent || excludeCurrent;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 2, 5, 4 };
        int target = 16;
        boolean result = isProductSubset(arr, target);
        System.out.println("Is there a subset with the product equal to " + target + " ? " + result);
    }
}
