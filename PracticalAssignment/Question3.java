/*
 * Q. Use a private keyword for a variable and use setters and getters method to initialize the variable using a constructor.
 * 
 * Ans-->
 */

package PracticalAssignment;

class SetGet{

    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

} 
public class Question3 {
    public static void main(String[] args) {
        
        SetGet s1 = new SetGet();

        s1.setAge(20);
        s1.setName("Kunal");

        System.out.println("Name is : " + s1.getName());
        System.out.println("Age is : " + s1.getAge());


    }
}
