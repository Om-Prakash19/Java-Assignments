package StringAssignment4;

//Question-->Write a program to delete all the consonants from the string "Hello,have a good day". 

//Ans :

public class Question7 {

    static String remConsonant(String str){
        return str.replaceAll("[BCDFGHJKLMNPQRRSTVWXYZbcdfghjklmnpqrstvwxyz]","");
    }
    public static void main(String[] args) {

        String str = "Hello,have a good day";
        System.out.println(remConsonant(str));
       
    }
}
