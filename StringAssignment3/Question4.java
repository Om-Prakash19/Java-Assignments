package StringAssignment3;
import java.util.*;

//Question--> Write a program to sort a string Alphabetically.

//Ans : 

public class Question4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string (in lowecase or uppercase) : ");
        String s = scan.nextLine();
        char c[] = s.toCharArray();
        Arrays.sort(c);
        System.out.println(c);

    }

    
}
