/*
 * Question 5 : You are given an integer array of coins representing coins of different denominations and an integer
amount representing a total amount of money.

Return the number of combinations that make up that amount. If that amount of money cannot be made up
by any combination of the coins, return 0.

You may assume that you have an infinite number of each kind of coin.

Input : amount = 5, coins = [1,2,5]
Output : 4
Explanation : 5 can be made by using the following combinations:
 */
public class Question5 {

    public static int combinationSum4(int[] nums, int target) {
        // Create a dp array to store the number of combinations for each amount
        int[] dp = new int[target + 1];
        dp[0] = 1; // Base case: one way to make amount 0

        // Iterate through each amount from 1 to target
        for (int i = 1; i <= target; i++) {
            // For each coin, update the dp array
            for (int num : nums) {
                if (i - num >= 0) {
                    dp[i] += dp[i - num];
                }
            }
        }

        return dp[target]; // Return the number of combinations for the target amount
    }
    public static void main(String[] args) {
        int amount = 5;
        int[] coins = {1, 2, 5};
        System.out.println(combinationSum4(coins, amount)); // Output: 4
    }
}
