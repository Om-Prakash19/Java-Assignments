package StringAssignment4;

//Write a program to check if the letter 'e' is present in the word 'umbrella'.

//Ans:

public class Question6{

    public static void main(String[] args) {
        
        StringBuffer str = new StringBuffer("umbrella");
        char ch = 'e';
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                System.out.println("Letter 'e' is present in the program");
                break;
            }
        }

    }

}