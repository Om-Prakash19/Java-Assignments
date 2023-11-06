/*
 * Q. What is No-args constructor ?
 * 
 * Ans--> No-args is a constructor which is written by a programmer which do not contain any arguments(inputs) in it.
 * 
 * Eg.
 */

package Constructor;

class Demo2{
    private int age;
    private String name;
    
    Demo2(){
        System.out.println("This is a no args constructor");
    }
}

public class Question5 {
    
    public static void main(String[] args) {
        
        Demo2 d = new Demo2();
    }
}
