/*Question--> Which modifiers are allowed for methods in Interface ? Explain with an example.
 * 
 * Answer--> In interface for methods public and abstract are the modifiers which are allowed and also they are pre-present in any method of an interface.
 * Example -->
 */

package Interface;

interface Interf
{
    public abstract void m1();
}

class B implements Interf
{
    public void m1()
    {
        System.out.println("In m1-B");
    }
} 
public class Question2 {
    public static void main(String[] args) {
        Interf i = new B();
        i.m1();
    }
}
