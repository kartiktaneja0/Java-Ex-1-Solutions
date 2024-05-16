// Enter 3 numbers from the user & make a function to print their average.
import java.util.*;
class Question1 {
    public static int AvgOfThree(int a, int b, int c) {
        int Avg = (a+b+c)/3;
        return Avg;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int Avg = AvgOfThree(a, b, c);
        System.out.println("Average of three numbers is : "+Avg);
    }
}