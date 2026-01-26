import java.util.Scanner;

public class _39SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Simple Interest Calculation Station...");
        System.out.println("Please Enter Principle Value:");
        double a = sc.nextDouble();
        System.out.println("Please Enter Rate:");
        double b = sc.nextDouble();
        System.out.println("Please Enter Time:");
        double c = sc.nextDouble();
        double d =(a*b*c)/100;
        System.out.println("Simple Interest is:"+d);
    }
}
