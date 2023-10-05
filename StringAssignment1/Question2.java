package StringAssignment1;
import java.util.Scanner;

//Question--> Write ajava program to know whether the given string is palindrome.

//Ans : 



public class Question2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String to be checked whether it is palindrom or not : ");
        String input = scan.next();
        input = input.toLowerCase();

        if(isPalindrome(input)){
            System.out.println(input + " is a palindrome string");
        }
        else{
            System.out.println(input + " is not a palindrome string");

        }
     }

    public static boolean isPalindrome(String str){
        int left = 0 , right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!= str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
   

    

    
}
