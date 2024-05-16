// Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.*;
class Question4 {
    public static double Circum(double r) {
        double cir = 2*3.14*r;
        return cir;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the radius below in cms :");
        double r = sc.nextDouble();

        double cir = Circum(r);
        System.out.println("The circumference of the circle is : "+cir+ "cms");
    }
}