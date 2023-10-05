package StringAssignment4;

//Question--> How do you compare two strings in java? Give an example.

//Ans : We can compare two Strings using "==" operand and equals() method.
//"==" operand check if reference is equal or not while equals() method checks the data inside object.

public class Question4 {
    public static void main(String[] args) {
        
        //using "==" operand
        String s1 = "Software";
        String s2 = "Software";
        System.out.println(s1==s2);


        //using equals() method
        String s3 = "Software";
        String s4 = "Software";
        System.out.println(s3.equals(s4));
    }
    
}
