/*
 * Question : . Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.
Return any possible rearrangement of s or return "" if not possible.
Example 1:
Input: s = "aab"
Output: "aba"
Example 2:
Input: s = "aaab"
Output: "
 */
import java.util.*;
public class Question1 {
    public static String reorganizeString(String s){
        Map<Character,Integer> freqMap = new HashMap<>();
        for(char c : s.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b) -> freqMap.get(b) - freqMap.get(a));
        maxHeap.addAll(freqMap.keySet());

        int maxFreq = Collections.max(freqMap.values());
        if(maxFreq > (s.length() + 1) / 2){
            return "";
        }

        StringBuilder result = new StringBuilder();
        Queue<Character> waitQueue = new LinkedList<>();

        while(!maxHeap.isEmpty()){
            char current = maxHeap.poll();
            result.append(current);
            freqMap.put(current, freqMap.get(current) - 1);

            if(!waitQueue.isEmpty()){
                char front = waitQueue.poll();
                if(freqMap.get(front) > 0){
                    maxHeap.offer(front);
                }
            }

            waitQueue.offer(current);  
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "aab";

        System.out.println("The rearranged string is : " + reorganizeString(s));
    }
}
