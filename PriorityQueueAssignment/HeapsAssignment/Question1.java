import java.util.*;
/*
 * Question : Given an integer array, find the kth largest element using priority queue.
Input 1 : arr[] = {1,2,3,5,2,6,9}   	k = 3
Output 1: 5
Input 2 : arr[] = {1,7,8,5,2,6,9}   	k = 6
Output 2: 2
 */


public class Question1 {
    public static int findKthLargest(int[] arr, int k){
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        for(int i=0;i<arr.length;i++){
            minheap.add(arr[i]);
            if(minheap.size()>k){
                minheap.poll();
            }
        }

        return minheap.peek();
    }

    public static void main(String[] args) {
        int arr[] = {1,7,8,5,2,6,9};
        int k = 6;

        System.out.println(findKthLargest(arr, k));
    }
}
