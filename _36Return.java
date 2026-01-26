import java.util.Scanner;

public class _36Return {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        greetUser();
        int first=readNum();
        int second = readNum();
        int sum=first+second;
        System.out.println("Sum of the Numbers is: "+sum);
    }

    public static int readNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int first = sc.nextInt();
        return first;
    }
    public static void greetUser(){
        System.out.println("Welcome to Calculator..");
    }
}
