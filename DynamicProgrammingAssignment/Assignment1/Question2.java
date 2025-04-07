/*
 * Question : The Tribonacci sequence Tn is defined as follows: 
T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
Given n, return the value of nth tribonacci number.

Input1: n =4;
Output : 4
 */
public class Question2 {

    public static long tribonacci(int n){
        long first = 0 , second = 1 , third = 1, fourth;

        for(int i = 3 ; i <= n ; i++){
            fourth = first + second + third;
            first = second;
            second = third;
            third = fourth;
        }

        return third;
    }
    public static void main(String[] args) {
        int n = 25;
        System.out.println(tribonacci(n));
    }
}
