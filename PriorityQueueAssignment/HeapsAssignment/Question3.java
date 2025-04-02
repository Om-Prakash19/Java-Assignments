
/*
 * Question :Given an array of string ‘words’ and an integer k, return the k most frequent strings. Return the answer
sorted by the frequency from highest to lowest. Sort the words with the same frequency by their
lexicographical order.
Example 1:
Input: words = ["i","love","leetcode","i","love","coding"], k = 2
Output: ["i","love"]
Explanation: "i" and "love" are the two most frequent words.
Note that "i" comes before "love" due to a lower alphabetical order.
Example 2:
Input: words = ["the","day","is","sunny","the","the","the","sunny","is","is"], k = 4
Output: ["the","is","sunny","day"]
Explanation: "the", "is", "sunny" and "day" are the four most frequent words, with the number of occurrences
being 4, 3, 2 and 1 respectively.
 */

import java.util.*;
public class Question3 {
    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<String> minHeap = new PriorityQueue<>(new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                if(map.get(a) == map.get(b)){
                    return b.compareTo(a);
                }
                return map.get(a) - map.get(b);
            }
        });

        for(String word : map.keySet()){
            minHeap.add(word);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        List<String> result = new ArrayList<>();
        while(!minHeap.isEmpty()){
            result.add(minHeap.poll());
        }

        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        String words[] = {"i","love","leetcode","i","love","coding"};
        int k = 2;

        System.out.println("The k most frequent words are : " + topKFrequent(words, k));
    }
}
