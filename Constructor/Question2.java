/*
 * Q. what is Constructor chaining ? 
 * 
 * Ans--> In a class when we create many constuctor with different arguments but same name , this process is called Constructor chaining or constructor overloading.
 * 
 * Eg.
 */


package Constructor;

class Demo{
 
    private int age;
    private String name;

    Demo(int age){
        this.age = age;
    }

    Demo(String name){
        this.name = name;
    }

    Demo(String name,int age){
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
        
        Demo d1 = new Demo(19);
        d1.disp();

        Demo d2 = new Demo("Prakash");
        d2.disp();

        Demo d3 = new Demo("Prakash",19);
        d3.disp();
    }
}
