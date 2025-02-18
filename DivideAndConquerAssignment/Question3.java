/*
 * Question :  Given an array of positive and negative integers, segregate them in linear time and constant
space. The output should print all negative numbers, followed by all positive numbers. The
relative order of elements must remain the same.
Input : arr[] = {19, -20, 7, -4, -13, 11, -5, 3}
Output : arr[] = {-20 ,-4, -13, -5, 19 ,7 ,11, 3}
 */
public class Question3 {

    public static void segregatePosNeg(int[] arr) {
        int n = arr.length;
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (arr[right] < 0) {
                if (right != left) {
                    int temp = arr[right];
                    for (int i = right; i > left; i--) {
                        arr[i] = arr[i - 1];
                    }
                    arr[left] = temp;
                }
                left++;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 19, -20, 7, -4, -13, 11, -5, 3 };
        segregatePosNeg(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
