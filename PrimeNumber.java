import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Prime Number Checker...");
        System.out.print("Please Enter Your Number:");
        int num = sc.nextInt();
        boolean prime = isPrime(num); 
        if (prime){
        System.out.println(num+" is a Prime Number");
        }
        else{
            System.out.println(num+" is not a Prime Number");
        }
    }
    public static boolean isPrime(int num){
        int i=2;
        while(i<num){
            if(num%i==0){
                return false;
            }
            i++;
        }
        return true;

    }
}
