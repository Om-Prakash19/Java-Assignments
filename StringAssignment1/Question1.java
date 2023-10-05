package StringAssignment1;
import java.util.Scanner;
public class Question1 {

    //Question--> Write a java program a reverse a string without using the inbuilt methods.

    // Ans :
     public static void main(String[] args) {
        
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a String : ");
      String s = scan.next();
      System.out.print("Reverse String is : ");
      
        for(int i =s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
}

    

