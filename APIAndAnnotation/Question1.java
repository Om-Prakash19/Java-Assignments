/*
 * Question -> Program to display current date and time in java.
 * 
 * Answer : 
 */

package APIAndAnnotation;

import java.time.*;

public class Question1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Current date is : " + date);

        LocalTime time = LocalTime.now();
        System.out.println("Current time is : " + time);
    }
}