/*Question  :  The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.Given an integer n, return the number of distinct solutions to the n-queens puzzle.
 * 
 */

package BacktrackingAssignment;

public class Question5 {
    public static int totalNQueens(int n) {
        return backtrack(n, 0, new boolean[n], new boolean[2 * n], new boolean[2 * n]);
    }

    private static int backtrack(int n, int row, boolean[] cols, boolean[] diag1, boolean[] diag2) {
        if (row == n) {
            return 1;
        }

        int count = 0;
        for (int col = 0; col < n; col++) {
            int d1 = row - col + n;
            int d2 = row + col;

            if (!cols[col] && !diag1[d1] && !diag2[d2]) {
                cols[col] = true;
                diag1[d1] = true;
                diag2[d2] = true;

                count += backtrack(n, row + 1, cols, diag1, diag2);

                cols[col] = false;
                diag1[d1] = false;
                diag2[d2] = false;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 4;
        int result = totalNQueens(n);
        System.out.println("Number of distinct solutions for " + n + "-Queens : " + result);
    }
}
