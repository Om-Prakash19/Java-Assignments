/*
 * Question :  You are given two integer arrays nums1 and nums2 sorted in ascending order and an integer k.
Define a pair (u, v) which consists of one element from the first array and one element from the second
array.
Return the k pairs (u1, v1), (u2, v2), ..., (uk, vk) with the smallest sums.
Example 1:
Input: nums1 = [1,7,11], nums2 = [2,4,6], k = 3
Output: [[1,2],[1,4],[1,6]]
Explanation: The first 3 pairs are returned from the sequence: [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
Example 2:
Input: nums1 = [1,1,2], nums2 = [1,2,3], k = 2
Output: [[1,1],[1,1]]
Explanation: The first 2 pairs are returned from the sequence: [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]
Example 3:
Input: nums1 = [1,2], nums2 = [3], k = 3
Output: [[1,3],[2,3]]
Explanation: All possible pairs are returned from the sequence: [1,3],[2,3]
 */
import java.util.*;
public class Question2 {
    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k){
        List<List<Integer>> result = new ArrayList<>();
        if(nums1.length == 0 || nums2.length == 0 || k == 0){
            return result;
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(new Comparator<int[]>(){
            @Override
            public int compare(int a[], int b[]){
                return (a[0] + a[1]) - (b[0] + b[1]);
            }
        });

        for(int i=0;i<nums1.length;i++){
            minHeap.add(new int[]{nums1[i], nums2[0], 0});
        }

        while(k > 0 && !minHeap.isEmpty()){
            int[] top = minHeap.poll();
            result.add(Arrays.asList(top[0], top[1]));
            k--;
            if(top[2] == nums2.length - 1){
                continue;
            }
            minHeap.add(new int[]{top[0], nums2[top[2] + 1], top[2] + 1});
        }

        return result;
    }

    public static void main(String[] args) {
        int nums1[] = {1,7,11};
        int nums2[] = {2,4,6};
        int k = 3;

        System.out.println("The k smallest pairs are : " + kSmallestPairs(nums1, nums2, k));
    }
}
