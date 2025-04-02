/*
 * Question :  Given n ropes of different lengths, connect them into a single rope with minimum cost. Assume that the
cost to connect two ropes is the same as the sum of their lengths.
For example,
Input:  [5, 4, 2, 8]
Output: The minimum cost is 36
[5, 4, 2, 8] –> First, connect ropes of lengths 4 and 2 that will cost 6.
[5, 6, 8]    –> Next, connect ropes of lengths 5 and 6 that will cost 11.
[11, 8]      –> Finally, connect the remaining two ropes that will cost 19.
Therefore, the total cost for connecting all ropes is 6 + 11 + 19 = 36.
 */

import java.util.*;
public class Question2 {
    public static int minCostToConnectRopes(int[] ropes){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i=0;i<ropes.length;i++){
            minHeap.add(ropes[i]);
        }

        int cost = 0;

        while(minHeap.size() > 1){
            int first = minHeap.poll();
            int second = minHeap.poll();

            int sum = first + second;
            cost += sum;

            minHeap.add(sum);
        }

        return cost;
    }

    public static void main(String[] args) {
        int ropes[] = {5, 4, 2, 8};

        System.out.println("The minimum cost to connect all the ropes is : " + minCostToConnectRopes(ropes));
    }
}
