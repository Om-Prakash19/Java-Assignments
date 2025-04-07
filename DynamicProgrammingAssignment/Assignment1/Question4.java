/*
 * Question 4:  There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e.,
grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot
can only move either down or right at any point in time.

Given the two integers m and n, return the number of possible unique paths that the robot can
take to reach the bottom-right corner

Input : m = 3, n = 7
Output : 28
*/

public class Question4 {

    public static int uniquePaths(int m, int n) {
        // Create a 2D array to store the number of unique paths to each cell
        int[][] dp = new int[m][n];

        // Base case: there is only one way to reach any cell in the first row or first column
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        // Fill the dp array using the recurrence relation
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        // The bottom-right cell contains the total number of unique paths
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int m = 3; // Number of rows
        int n = 7; // Number of columns

        System.out.println(uniquePaths(m, n)); // Output: 28
    }
}
