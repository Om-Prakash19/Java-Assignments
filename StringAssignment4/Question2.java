package StringAssignment4;

//Question--> How do you concate two Strings in Java ? Give an example.

//Ans : In java strings can be mainly concatenated by using "+" operand and "concat()" function.

public class Question2 {
    public static void main(String[] args) {
        
        //Using "+" operand
        String s1 = "Om";
        s1 = s1 + " " + "Prakash";
        System.out.println(s1);

        //Using concat() function
        String s2 = "Om";
        s2 = s2.concat(" Prakash");
        System.out.println(s2);


    }
    
}
