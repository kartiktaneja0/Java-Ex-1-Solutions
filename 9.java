// Write a function that calculates the Greatest Common Divisor of 2 numbers.
import java.util.*;
class Question9 {
    public static void HCF(int a, int b) {
        int hcf = 0;
        for(int i=1;i<=a && i<=b;i++) {
            if(a%i==0 && b%i==0) {
                hcf = i;
            }
        }
        System.out.println("The HCF is : "+hcf);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the numbers below : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        HCF(a,b);
    }
}