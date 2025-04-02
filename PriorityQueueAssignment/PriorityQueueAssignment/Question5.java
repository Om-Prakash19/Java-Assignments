/*
 * Question : Given that integers are read from a data stream. Find the median of elements read so for in an efficient
way. For simplicity assume, there are no duplicates. For example, let us consider the streams 5, 15, 1, 3 … 
After reading 1st element of stream - 5 -> median - 5
After reading 2nd element of stream - 5, 15 -> median - 10
After reading 3rd element of stream - 5, 15, 1 -> median - 5
After reading the 4th element of stream - 5, 15, 1, 3 -> median - 4, so on.
 */

import java.util.*;
public class Question5 {
    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;

    public Question5(){
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void addNum(int num){
        maxHeap.add(num);
        minHeap.add(maxHeap.poll());

        if(maxHeap.size() < minHeap.size()){
            maxHeap.add(minHeap.poll());
        }
    }

    public double findMedian(){
        if(maxHeap.size() == minHeap.size()){
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }else{
            return maxHeap.peek();
        }
    }

    public static void main(String[] args) {
        Question5 obj = new Question5();
        obj.addNum(5);
        System.out.println("The median is : " + obj.findMedian());
        obj.addNum(15);
        System.out.println("The median is : " + obj.findMedian());
        obj.addNum(1);
        System.out.println("The median is : " + obj.findMedian());
        obj.addNum(3);
        System.out.println("The median is : " + obj.findMedian());
    }
}
