/*
 * Q. How to achieve Encapsulation in Java ? Give an example.
 * 
 * Ans--> To achieve Encapsulation,  we use private members, 'this' keyword and setter and getter method.
 * 
 * Eg.
 */


package Encapsulation;

class Demo2{

    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

public class Question6{
    public static void main(String[] args) {
        
        Demo2 d = new Demo2();

        d.setName("Om");
        d.setAge(19);

        System.out.println("Name is : " + d.getName());
        System.out.println("Age is : " + d.getAge());




    }
}
