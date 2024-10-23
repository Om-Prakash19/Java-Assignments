/*Question :  Implement a Map in java which takes the input and print the list in sorted order based on key.
 * 
 */

package HashMapAssignment;

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> t1 = new TreeMap<>();

        t1.put(5, "Rahul");
        t1.put(7, "Laxman");
        t1.put(1, "Ram");
        t1.put(4, "Krishna");
        t1.put(2, "Lakshya");

        System.out.println(t1);

    }
}
