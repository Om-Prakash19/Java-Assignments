/*
 * Q. Writw a program which has static block and constructor overloading  , initialise variables using constructor and print it.
 * 
 * Ans-->
 */

package PracticalAssignment;

class Overloading{

    private int age;
    private String name;

    static{
        System.out.println("This is a static block");
    }

    Overloading(int age){
        this.age = age;
    }

    Overloading(String name){
        this.name = name;
    }

    Overloading(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void disp(){
        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
        System.out.println("");
    }

}
public class Question5 {
    public static void main(String[] args) {
        
        Overloading d1 = new Overloading(19);
        d1.disp();

        Overloading d2 =new Overloading("Rahul");
        d2.disp();

        Overloading d3 = new Overloading("Rohan",21);
        d3.disp();
    }
}
