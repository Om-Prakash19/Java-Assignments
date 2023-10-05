package StringAssignment1;

// Question--> Write a java program to remove a particular character from a string.

//Ans : 
public class Question4 {
    public static void main(String[] args) {
        

        StringBuilder str = new StringBuilder("tendulkar");;
        char ch = 'a';
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                System.out.print(str.deleteCharAt(i));
            }
        }
    
    }

}
