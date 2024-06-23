/*
 * Question -> Write a program to convert a date to a string in the format "MM/dd/yyyy".
 * 
 * Answer : 
 */

package APIAndAnnotation;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Question2 {
    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String dateInFormat = sdf.format(date);
        System.out.println("Date in MM/dd/yyyy is : " + dateInFormat);
    }
}