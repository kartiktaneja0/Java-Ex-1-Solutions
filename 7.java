// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
import java.util.*;
class Question7 {
    public static void main(String[] args) {
        int zero=0;
        int even=0;
        int odd=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of inputs you want to give below");
        int num = sc.nextInt();
        System.out.println("Please start entering the numbers below :");
        for(int i=0;i<num;i++) {
            int number = sc.nextInt();
            if(number==0) {
                zero++;
            }
            else if(number%2==0) {
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("The number of zeros are : "+zero);
        System.out.println("The number of odd numbers are : "+odd);
        System.out.println("The number of even numbers are : "+even);
    }
}
