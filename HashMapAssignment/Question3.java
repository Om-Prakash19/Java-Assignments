/*Question: Detect if an Array contains a duplicate element. At Most 1 duplicate would be there.
 * 
 */

package HashMapAssignment;

import java.util.*;

public class Question3 {

    public static boolean hasAtMostOneDuplicate(int[] arr) {
        HashMap<Integer, Integer> elementCount = new HashMap<>();
        int duplicateCount = 0;

        for (int num : arr) {
            if (elementCount.containsKey(num)) {
                duplicateCount++;
                if (duplicateCount > 1) {
                    return false;
                }
            } else {
                elementCount.put(num, 1);
            }
        }

        return duplicateCount == 1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = hasAtMostOneDuplicate(arr);

        if (result == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
