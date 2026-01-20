import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Compound Interest Calculation Station:");
        System.out.println("Please Enter Principle Value:");
        double a = sc.nextDouble();
        System.out.println("Enter Rate:");
        double b = sc.nextDouble();
        System.out.println("Enter time:");
        double c = sc.nextDouble();
        double d = a*(1+b/100)*c;
        System.out.println("Compound Interest Will Be:"+d);
    }
}
