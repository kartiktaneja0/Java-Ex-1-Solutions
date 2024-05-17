// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
import java.util.*;
class Question8 {
    public static void Power(int x,int n) {
        int ans = x;
        for(int i=1;i<n;i++) {
            ans = ans*x;
        }
        System.out.println("The answer is : "+ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        System.out.println("Enter the power");
        int n = sc.nextInt();
        Power(x,n);
    }
}