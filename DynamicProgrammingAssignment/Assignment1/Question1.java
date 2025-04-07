/*
 * Question : There are n stairs, a person standing at the bottom wants to reach the top. The person can
climb either 1,2,3…m stairs at a time where m is a user given integer. Count the number of ways
the person can reach the top.

Input : n = 5, m =3
Output : 13
 */
public class Question1 {

    public static int countWays(int n, int m) {
        // Base case: if there are no stairs, there is one way to stay at the ground level
        if (n == 0) {
            return 1;
        }
        // If there are negative stairs, there are no ways to reach the top
        if (n < 0) {
            return 0;
        }

        int totalWays = 0;
        // Try all possible steps from 1 to m
        for (int i = 1; i <= m; i++) {
            totalWays += countWays(n - i, m);
        }
        return totalWays;
    }
    public static void main(String[] args) {
        int n = 5; // Number of stairs
        int m = 3; // Maximum steps that can be taken at a time

        System.out.println(countWays(n, m));
    }
}
