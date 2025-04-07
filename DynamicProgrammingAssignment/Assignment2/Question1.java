
/*
 * Question : . You are given an m x n integer array grid. There is a robot initially located at the top-left corner (i.e.,
grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only
move either down or right at any point in time.

An obstacle and space are marked as 1 or 0 respectively in the grid. A path that the robot takes cannot
include any square that is an obstacle.

Return the number of possible unique paths that the robot can take to reach the bottom-right corner. 

Input : grid = [[0,0,0],[0,1,0],[0,0,0]]
Output : 2

 */
public class Question1 {

    public static int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // If the starting or ending cell is an obstacle, return 0
        if (grid[0][0] == 1 || grid[m - 1][n - 1] == 1) {
            return 0;
        }

        // Create a 2D array to store the number of unique paths to each cell
        int[][] dp = new int[m][n];
        dp[0][0] = 1; // Starting point

        // Fill the first row
        for (int j = 1; j < n; j++) {
            dp[0][j] = (grid[0][j] == 0) ? dp[0][j - 1] : 0;
        }

        // Fill the first column
        for (int i = 1; i < m; i++) {
            dp[i][0] = (grid[i][0] == 0) ? dp[i - 1][0] : 0;
        }

        // Fill the rest of the dp array
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (grid[i][j] == 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                } else {
                    dp[i][j] = 0; // Obstacle
                }
            }
        }

        // The bottom-right cell contains the total number of unique paths
        return dp[m - 1][n - 1];
    }
    public static void main(String[] args) {
        int[][] grid = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        System.out.println(uniquePathsWithObstacles(grid)); // Output: 2
    }
}
