/*
 * Question : Given an array of positive and negative integers, segregate them in linear time and constant
space. The output should print all negative numbers, followed by all positive numbers.

Input :  arr[] = {19, -20, 7, -4, -13, 11, -5, 3}
Output : arr[] = {-20 ,-4, -13, -5, 19 ,11 ,3, 7}
 */
public class Question2 {

    public static void partition(int arr[]) {
        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[p];
                arr[p] = temp;
                p++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 19, -20, 7, -4, -13, 11, -5, 3 };

        partition(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
