/*
 * Q. Write a program and create a constructor with parameters and initialize the variables using a constructor.
 * 
 * Ans-->
 */

package PracticalAssignment;

class Initialize{

    private int age;
    private String name;

    Initialize(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void disp(){
        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
    }
}
public class Question2 {
    public static void main(String[] args) {
        
        Initialize s1 = new Initialize("Poonam", 19);
        s1.disp();
    }
}
