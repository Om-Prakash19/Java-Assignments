/*
 * Q. Write a program to call a method without creating an object of a class.
 * 
 * Ans-->
 */

package PracticalAssignment;

class Static{

    static void disp(){
        System.out.println("A method is called without creating an object");
    }
}
public class Question4 {
    public static void main(String[] args) {
        
        Static.disp();
    }
}
