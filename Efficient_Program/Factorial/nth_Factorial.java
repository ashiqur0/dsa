/*
Factorial: nth Factorial Number
*/
package Efficient_Program.Factorial;

public class nth_Factorial {

    public static long factorial(int num) {
        if (num <= 1) {
            return num;
        }
        
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}