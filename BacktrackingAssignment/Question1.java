/*Question :  Given an integer array arr and an integer k, return true if it is
possible to divide the vector into k non-empty subsets with equal sum.
 * 
 */

package BacktrackingAssignment;

import java.util.Arrays;

public class Question1 {
    public boolean canPartitionKSubsets(int[] arr, int k) {
        int totalSum = 0;
        for (int num : arr)
            totalSum += num;

        if (totalSum % k != 0)
            return false;

        int targetSum = totalSum / k;
        Arrays.sort(arr);
        reverse(arr);

        int[] subsets = new int[k];
        return backtrack(arr, subsets, targetSum, arr.length - 1);
    }

    private boolean backtrack(int[] arr, int[] subsets, int targetSum, int index) {
        if (index < 0) {
            for (int sum : subsets) {
                if (sum != targetSum)
                    return false;
            }
            return true;
        }

        for (int i = 0; i < subsets.length; i++) {
            if (subsets[i] + arr[index] <= targetSum) {
                subsets[i] += arr[index];
                if (backtrack(arr, subsets, targetSum, index - 1))
                    return true;
                subsets[i] -= arr[index];
            }

            if (subsets[i] == 0) {
                break;
            }
        }
        return false;

    }

    private void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Question1 solution = new Question1();
        int[] arr = { 1 , 3 , 2 , 2};
        int k = 2;
        System.out.println(solution.canPartitionKSubsets(arr, k));
    }
}
