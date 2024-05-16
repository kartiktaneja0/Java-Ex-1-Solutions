// Write a function to print the sum of all odd numbers from 1 to n.
import java.util.*;
class Question2 {
    public static void AllOdd(int n) {
        for(int i=1;i<=n;i=i+2){
            System.out.println(i);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number below upto which you want all the odd numbers to print");
        int n = sc.nextInt();
        AllOdd(n);
    }
}