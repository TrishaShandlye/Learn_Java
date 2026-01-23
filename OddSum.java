import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Odd Addition...");
        System.out.print("Please Enter Your Number: ");
        int num = sc.nextInt();

        int sum = oddSum(num);

        System.out.println("Odd Sum till " + num + " is " + sum);

        sc.close();
    }

    public static int oddSum(int n) {
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum = sum + i;
            i = i + 2;
        }

        return sum;
    }
}

