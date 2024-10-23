/*Question : You are keeping the scores for a baseball game with strange rules. At the beginning of the
game, you start with an empty record.


You are given a list of strings operations, where operations[i] is the ith operation you must apply
to the record and is one of the following:


An integer x.

Record a new score of x.

'+'.

Record a new score that is the sum of the previous two scores.

'D'.

Record a new score that is the double of the previous score.

'C'.

Invalidate the previous score, removing it from the record.

Return the sum of all the scores on the record after applying all the operations.
 * 
 */

package StacksAssignment;

import java.util.*;

public class Question3 {

    public static int calPoints(String[] operations) {
        Stack<Integer> record = new Stack<>();

        for (String op : operations) {
            switch (op) {
                case "+":
                    int top = record.pop();
                    int newScore = top + record.peek();
                    record.push(top);
                    record.push(newScore);
                    break;
                case "D":
                    record.push(2 * record.peek());
                    break;
                case "C":
                    record.pop();
                    break;
                default:
                    record.push(Integer.parseInt(op));
                    break;
            }
        }

        int totalScore = 0;
        for (int score : record) {
            totalScore += score;
        }

        return totalScore;
    }

    public static void main(String[] args) {
        String[] operations1 = { "5", "2", "C", "D", "+" };
        String[] operations2 = { "5", "-2", "4", "C", "D", "9", "+", "+" };

        System.out.println(calPoints(operations1));
        System.out.println(calPoints(operations2));
    }
}
