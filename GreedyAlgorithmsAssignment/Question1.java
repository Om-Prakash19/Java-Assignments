/*
 * Question : Find the minimum sum of Products of two arrays of the same size, given that k modifications
are allowed on the first array. In each modification, one array element of the first array can either
be increased or decreased by 2.
Input : a[] = {1,2,-3}
b[] = {-2,3,-5}
k=5
Output : -31
Explanation : Here n = 3 and k = 5. 
So, we modified a[2], which is -3 and 
increased it by 10 (as 5 modifications 
are allowed).
Final sum will be :
(1 * -2) + (2 * 3) + (7 * -5)
  -2    +    6    -    35
              -31
(which is the minimum sum of the array 
with given conditions)
 */
public class Question1 {
    public static int minimizeSum(int[] A, int[] B, int n, int k) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i] * B[i];
        }

        while (k-- > 0) {
            int maxGain = Integer.MIN_VALUE;
            int index = -1;
            int newValue = 0;

            for (int i = 0; i < n; i++) {
                int decrease = A[i] - 2;
                int increase = A[i] + 2;

                int impactDecrease = sum - (A[i] * B[i]) + (decrease * B[i]);
                int impactIncrease = sum - (A[i] * B[i]) + (increase * B[i]);

                if (impactDecrease < sum && sum - impactDecrease > maxGain) {
                    maxGain = sum - impactIncrease;
                    index = i;
                    newValue = decrease;
                }

                if (impactIncrease < sum && sum - impactIncrease > maxGain) {
                    maxGain = sum - impactIncrease;
                    index = i;
                    newValue = increase;
                }

            }
            if (index == -1)
                break;

            A[index] = newValue;
            sum -= maxGain;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, -3 };
        int[] B = { -2, 3, -5 };
        int k = 5;

        int result = minimizeSum(A, B, A.length, k);
        System.out.println(result);
    }
}
