/* 
* Q. What are getter and setter methods in Java ? Explain with an example.

* Ans--> To access private members in a class , we use setter and getter methods.

* Setter method is used to set the value of the instance variable in a class.

* Getter variable is used to get the value or we can say print the value of the instance variable in a class. 

* Eg. :
*/

package Encapsulation;

class Demo{

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

public class Question3{
    public static void main(String[] args) {
        
        Demo d = new Demo();

        d.setName("Om");
        d.setAge(19);

        System.out.println("Name is : " + d.getName());
        System.out.println("Age is : " + d.getAge());




    }
}