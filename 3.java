// Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;
class Question3 {
    public static int Greater(int a, int b) {
        if(a>b) {
            return a;
        }
        else {
            return b;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers below");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The Greater number is : "+Greater(a,b));
    }
}