
/*
 * Question :  Given two arrays of equal size n and an integer k. The task is to permute both arrays such
that the sum of their corresponding element is greater than or equal to k i.e a[i] + b[i] >= k. The
task is to print Yes if any such permutation exists, otherwise print No.
Input :  a[] = {2, 1, 3}, 
         b[] = { 7, 8, 9 }, 
         k = 10. 
Output : Yes
Input :  a[] = {1, 2, 2, 1}, 
         b[] = { 3, 3, 3, 4 }, 
         k = 5
Output : No
 */
import java.util.*;

public class Question4 {

    public static boolean permute(Integer[] a, Integer[] b,int k) {
        int n = a.length;
        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            if (a[i] + b[i] < k) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer a[] = { 1,2,2,1 };
        Integer b[] = { 3,3,3,4 };
        int k = 5;

        if (permute(a, b, k)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
