/*
 * Q. Differentiate between Runtime and CompileTime Polymorphism . Explain with an Example.
 * 
 * Ans-->Method overloading :
* The process of extending the existing method functionality with new functionality is called method overloading.
* It is also called static polymorphism and compile time polymorphism.
*In this case different method parameters must be given.
*We can achieve it with or without inheriance.

Method overriding :
*The process of replacing the existing method functionality with new functionality is called method overriding.
*It is also called dynamic polymorphism and run time polymorphism.
*In this  case the same method parameters must be provieded.
*We can only achieve this through inheritance.

Eg.
 */

package InheritancePolymorphismAndAbstraction;

class Parent 
{
    int x;
    public void m1()
    {
        System.out.println("m1 from class Parent");
    }

    public int m2(int m)
    {
       x = m;
       return m; 
    }
}

class Child extends Parent
{
    float y;
    public void m1(){
        System.out.println("m1 from class Child");
    }  

    public float m2(float m)
    {
        y = m;
        return m;
    }
}

public class Question10 {
    public static void main(String[] args) {
        
        Child c = new Child();
        c.m1(); //CompileTime Polymorphism in method m1()
        System.out.println(c.m2(10.5f)); // RunTime Polymorphism in method m2()
    
    }
}
