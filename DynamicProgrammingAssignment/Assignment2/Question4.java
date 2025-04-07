/*
 * Question :4. Given an integer array nums, return true if you can partition the array into two subsets such that the sum
of the elements in both subsets is equal or false otherwise.

Input : nums = [1,5,11,5]
Output : true
Explanation : The array can be partitioned as [1, 5, 5] and [11].
 */
public class Question4 {

    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        // If the total sum is odd, we cannot partition it into two equal subsets
        if (sum % 2 != 0) {
            return false;
        }

        int target = sum / 2;
        boolean[][] dp = new boolean[nums.length + 1][target + 1];

        // Initialize the first column as true (0 sum is possible with empty subset)
        for (int i = 0; i <= nums.length; i++) {
            dp[i][0] = true;
        }

        // Fill the dp table
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 1; j <= target; j++) {
                dp[i][j] = dp[i - 1][j]; // Exclude the current number
                if (j >= nums[i - 1]) {
                    dp[i][j] = dp[i][j] || dp[i - 1][j - nums[i - 1]]; // Include the current number
                }
            }
        }

        return dp[nums.length][target];
    }
    public static void main(String[] args) {
        int[] nums = {1, 5, 11, 5};
        System.out.println(canPartition(nums)); // Output: true
    }
}
