/*Question :  Given an encoded string, return its decoded string. The encoding rule is: k[encoded_string],
where the encoded_string inside the square brackets is being repeated exactly k times. Note
that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square
brackets are well-formed, etc. Furthermore, you may assume that the original data does not
contain any digits and that digits are only for those repeat numbers, k. For example, there will
not be input like 3a or 2[4].
 * 
 */

package StacksAssignment;

import java.util.Stack;

public class Question2 {

    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> resultStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {

                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(k);
                resultStack.push(currentString);
                currentString = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                int repeatCount = countStack.pop();
                StringBuilder decodedString = resultStack.pop();
                for (int i = 0; i < repeatCount; i++) {
                    decodedString.append(currentString);
                }
                currentString = decodedString;
            } else {
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }

    public static void main(String[] args) {
        String s1 = "3[a]2[bc]";
        String s2 = "3[a2[c]]";
        String s3 = "2[abc]3[cd]ef";

        System.out.println(decodeString(s1));
        System.out.println(decodeString(s2));
        System.out.println(decodeString(s3));
    }
}
