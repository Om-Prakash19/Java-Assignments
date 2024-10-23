/*Question : Given two strings ransomNote and magazine, return true if ransomNote can be constructed
by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote
 * 
 */

package HashMapAssignment;

import java.util.HashMap;

public class Question5 {

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineCount = new HashMap<>();

        for (char ch : magazine.toCharArray()) {
            magazineCount.put(ch, magazineCount.getOrDefault(ch, 0) + 1);
        }
        for (char ch : ransomNote.toCharArray()) {
            if (!magazineCount.containsKey(ch) || magazineCount.get(ch) == 0) {
                return false;
            }
            magazineCount.put(ch, magazineCount.get(ch) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        String ransomNote1 = "aa";
        String magazine1 = "aab";
        System.out.println(canConstruct(ransomNote1, magazine1));

        String ransomNote2 = "aa";
        String magazine2 = "ab";
        System.out.println(canConstruct(ransomNote2, magazine2));
    }
}
