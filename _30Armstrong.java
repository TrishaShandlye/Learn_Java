import java.util.Scanner;

public class _30Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Armstrong Number...");
        System.out.print("Please Enter Your Number:");
        int num = sc.nextInt();
        boolean armstrong = isArmstrong(num);
        if (armstrong) {
            System.out.println("Your Number is Armstrong");
        } else {
            System.out.println("Your Number is not Armstrong");
        }
    }

    public static boolean isArmstrong(int num){
        int noOfDigits=noOfDigits(num);
        int numCopy=num;
        int finalNumber=0;
        while(num>0){
            int lastDigit=num%10;
            num/=10;
            finalNumber+=power(lastDigit,noOfDigits);
        }
        return finalNumber==numCopy;
    }

    public static int power(int num1, int num2) {
        int result = 1;
        int i = 0;
        while (i < num2) {
            result *= num1;
            i++;
        }
        return result;
    }

    public static int noOfDigits(int num) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }
        return digits;
    }
}
