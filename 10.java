// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
import java.util.*;
class Question10 {
    public static void Fibonacci(int n) {
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        for(int i=1;i<=n;i++) {
            int num = a+b;
            System.out.print(num+" ");
            a = b;
            b = num;   
        }
    }
    public static void main(String main[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number below : ");
        int n = sc.nextInt();

        Fibonacci(n);
    }
}