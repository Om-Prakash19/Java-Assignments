/*Question :  We are given an array of asteroids of integers representing asteroids in a row.For each
asteroid, the absolute value represents its size, and the sign represents its direction (positive
meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will
explode. If both are the same size, both will explode. Two asteroids moving in the same direction
will never meet.
 * 
 */

package StacksAssignment;

import java.util.Stack;

public class Question4 {

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            boolean exploded = false;

            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (stack.peek() < -asteroid) {
                    stack.pop();
                } else if (stack.peek() == -asteroid) {
                    stack.pop();
                    exploded = true;
                    break;
                } else {
                    exploded = true;
                    break;
                }
            }

            if (!exploded) {
                stack.push(asteroid);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] asteroids1 = { 5, 10, -5 };
        int[] asteroids2 = { 8, -8 };
        int[] asteroids3 = { 10, 2, -5 };

        System.out.println(java.util.Arrays.toString(asteroidCollision(asteroids1)));
        System.out.println(java.util.Arrays.toString(asteroidCollision(asteroids2)));
        System.out.println(java.util.Arrays.toString(asteroidCollision(asteroids3)));
    }
}
