import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Greatest Common Divisor Station...");
        System.out.print("Please Enter Your First Number: ");
        int first = sc.nextInt();

        System.out.print("Please Enter Your Second Number: ");
        int second = sc.nextInt();

        int gcd = gcd(first, second);
        System.out.println("Greatest Common Divisor Of The Two Numbers is: " + gcd);
    }

    public static int gcd(int first, int second) {
        int gcd = 1;
        int i = 2;
        int least = least(first, second);

        while (i <= least) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int num1, int num2) {
        if (num1 > num2) {
            return num2;
        } else {
            return num1;
        }
    }
}
