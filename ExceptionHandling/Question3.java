/*Question --> How can you handle exceptions in Java ? Explain with an example.
 * 
 * Answer --> We can handle exception in java with the help of try and catch block.
 * Syntax :
 * try
 * {
 *      risky code
 * }
 * catch(X e)
 * {
 *      handled code
 * }
 * Example : 
 */

package ExceptionHandling;

public class Question3 {
    public static void main(String[] args) {
        
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Error " + ae.getMessage());
        }
    }
}
