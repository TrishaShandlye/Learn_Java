import java.util.Scanner;

public class _32Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Factorial Station...");
        System.out.print("Please Enter Your Number:");
        int num = sc.nextInt();
        long fact=factorial(num);
        System.out.println("Factorial is "+fact);
    }
    public static long factorial(int num){
        if(num<2){
            return 1;
        }
        long fact=1;
        int i=2;
        while(i<=num){
            fact = fact*i;
            i++;
        }
        return fact;
    }
}
