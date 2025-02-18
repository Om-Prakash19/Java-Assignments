
/*
 * Question :  Given an integer array, find the kth largest element using the quickselect algorithm.
 * Input :  arr[] = {1,3,2,4,5,6,7} , k = 3
 * Output : 5
 * Input : arr[] = {4,3,3,2,1} , k = 4
   Output : 2
 */
import java.util.*;

public class Question1 {
    private static Random rand = new Random();

    public static int quickSelect(int[] arr, int k) {
        return quickSelect(arr, 0, arr.length - 1, k - 1);
    }

    public static int quickSelect(int[] arr, int left, int right, int k) {
        if (left == right) {
            return arr[left];
        }

        int pivotIndex = partition(arr, left, right);
        if (k == pivotIndex)
            return arr[k];
        else if (k < pivotIndex)
            return quickSelect(arr, left, pivotIndex - 1, k);
        else
            return quickSelect(arr, pivotIndex + 1, right, k);
    }

    private static int partition(int[] arr, int left, int right) {
        int pivotIndex = left + rand.nextInt(right - left + 1);
        int pivotValue = arr[pivotIndex];
        swap(arr, pivotIndex, right);
        int storeIndex = left;

        for (int i = left; i < right; i++) {
            if (arr[i] > pivotValue) {
                swap(arr, storeIndex, i);
                storeIndex++;
            }
        }
        swap(arr, storeIndex, right);
        return storeIndex;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 3, 2, 1 };
        int k = 4;

        int res = quickSelect(arr, k);
        System.out.println(res);
    }
}
