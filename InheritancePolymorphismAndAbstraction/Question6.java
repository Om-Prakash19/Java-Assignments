/*
 * Q. What is abstraction ? explain with an example.
 * 
 * Ans--> When we don't want to give the body of a method then we declare it with "abstract" keyword.This process is called abstraction.class should also be declared with abstract keyword.
 * 
 * Eg.
 */


package InheritancePolymorphismAndAbstraction;

abstract class A
{
    abstract public void m1();
}

class B extends A{
    public void m1()
    {
        System.out.println("m1 from class B");
    }
}

public class Question6 {
    public static void main(String[] args) {
        
        B b = new B();
        b.m1();
    }
}
