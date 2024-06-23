/*
 * Question -> What is enums in Java ? explain with an example.
 * 
 * Answer : Enums in java are used to define group of named constants. It can be created using "enum" keyword and can be accessed directly by enum name.
 * For example : 
 */

package APIAndAnnotation;

//creating an enum
enum Color
{
    RED,GREEN,BLUE
}

public class Question4 {
    public static void main(String[] args) {
        //accessing enum 
        Color color = Color.RED;
        System.out.println(color);
    }
}
