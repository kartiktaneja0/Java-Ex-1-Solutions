// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
import java.util.*;
class Question5 {
    public static String eligibleToVote(int age) {
        if(age>=18) {
            return "Eligible to vote";
        }
        else {
            return "Not Eligible to vote";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age below : ");
        int age = sc.nextInt();

        String ans = eligibleToVote(age);
        System.out.println(ans);
    }
}