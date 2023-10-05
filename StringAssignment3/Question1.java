package StringAssignment3;

//Question--> What is Mutable String in Java Explain with example.

//Ans : In Mutable String changes one is reflected on the same object or we can say no new object is created on memory on every changes done on String.
//Eg.StringBuffer,StringBuilder.

public class Question1 {
    public static void main(String[] args) {
      
         StringBuilder str = new StringBuilder("Virat");
         str.append(" Kohli");
         System.out.print(str);
    }
   

}
