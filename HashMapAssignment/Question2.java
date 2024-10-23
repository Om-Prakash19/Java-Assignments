/*Question :  Implement a Map in java which takes the input and print the list in sorted order based on value
 * 
 */

package HashMapAssignment;

import java.util.*;

public class Question2 {

    public static <K, V extends Comparable<V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> entryList = new ArrayList<>(map.entrySet());

        entryList.sort((e1, e2) -> {
            int valueCompare = e1.getValue().compareTo(e2.getValue());
            if (valueCompare == 0) {
                return e1.getKey().toString().compareToIgnoreCase(e2.getKey().toString());
            }
            return valueCompare;
        });
        Map<K, V> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Rahul", 5);
        map.put("Lakshman", 7);
        map.put("Ram", 1);
        map.put("Krrish", 4);
        map.put("Lakshay", 2);

        Map<String, Integer> sortedMap = sortByValue(map);

        System.out.println(sortedMap);
    }
}
