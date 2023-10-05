package StringAssignment3;

//Question--> Write a program to reverse a sentence while preserving the position
//Input : "Think Twice"
//Output : "kniht eciwt"

public class Question3 {
    public static void main(String[] args) {
       
        StringBuffer s1 = new StringBuffer("Think");
        StringBuffer s2 = new StringBuffer("Twice");
        String s3 = s1.reverse() + " " + s2.reverse();
        System.out.println(s3.toLowerCase());
       
    }
   
    
}
