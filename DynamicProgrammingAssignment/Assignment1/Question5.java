/*
 * Question : . Given a triangle array, return the minimum path sum from top to bottom.For each step, you
may move to an adjacent number of the row below. More formally, if you are on index i on the
current row, you may move to either index i or index i + 1 on the next row. 

Input : triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
Output : 11
 */

public class Question5 {

    public static int minimumTotal(int[][] triangle) {
        int n = triangle.length;
        // Create a dp array to store the minimum path sums
        int[] dp = new int[n];
        
        // Initialize the last row of dp with the last row of the triangle
        for (int i = 0; i < n; i++) {
            dp[i] = triangle[n - 1][i];
        }
        
        // Iterate from the second last row to the top row
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                // Update the dp array with the minimum path sum
                dp[j] = triangle[i][j] + Math.min(dp[j], dp[j + 1]);
            }
        }
        
        // The top element of dp contains the minimum path sum from top to bottom
        return dp[0];
    }

    public static void main(String[] args) {
        int[][] triangle = {
            {2},
            {3, 4},
            {6, 5, 7},
            {4, 1, 8, 3}
        };
        System.out.println(minimumTotal(triangle)); // Output: 11
    }
}
