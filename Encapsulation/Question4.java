/*
 * Q. What is the use of this keyword explain with an example.
 * 
 * Ans--> In a method if both instance variable and local variable have same name , there will be a name clash and JVM will always give preference to local variable. This type of situation is called "Shadowing Problem".
 * To overcome this problem , we use 'this' keyword
 * 
 * Eg.
 */

package Encapsulation;

class Demo1{

    private int age;
    private String name;

    Demo1(String name,int age){
        this.name  = name;
        this.age = age;
    }

    public void disp(){
        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
    }
}
public class Question4 {
    public static void main(String[] args) {
        
        Demo1 d = new Demo1("Om",19);
        d.disp();
    }
}
