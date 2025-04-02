/*
 * Question :  You are given an m x n matrix mat that has its rows sorted in non-decreasing order and an integer k.
You are allowed to choose exactly one element from each row to form an array.
Return the kth smallest array sum among all possible arrays.
Example 1:
Input: mat = [[1,3,11],[2,4,6]], k = 5
Output: 7
Explanation: Choosing one element from each row, the first k smallest sum are:
[1,2], [1,4], [3,2], [3,4], [1,6]. Where the 5th sum is 7.
Example 2:
Input: mat = [[1,3,11],[2,4,6]], k = 9
Output: 17
Example 3:
Input: mat = [[1,10,10],[1,4,5],[2,3,6]], k = 7
Output: 9
Explanation: Choosing one element from each row, the first k smallest sum are:
[1,1,2], [1,1,3], [1,4,2], [1,4,3], [1,1,6], [1,5,2], [1,5,3]. Where the 7th sum is 9.   
 */
import java.util.*;

public class Question4 {
    public static int kthSmallestSum(int[][] mat, int k){
        int m = mat.length;
        int n = mat[0].length;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(0);

        for(int i=0;i<m;i++){
            PriorityQueue<Integer> nextHeap = new PriorityQueue<>();
            for(int x : minHeap){
                for(int j=0;j<n;j++){
                    nextHeap.add(x + mat[i][j]);
                    if(nextHeap.size() > k){
                        nextHeap.poll();
                    }
                }
            }
            minHeap = nextHeap;
        }

        return minHeap.poll();
    }

    public static void main(String[] args) {
        int mat[][] = {{1,3,11},{2,4,6}};
        int k = 5;

        System.out.println("The kth smallest array sum is : " + kthSmallestSum(mat, k));
    }
}
