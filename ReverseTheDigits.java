import java.util.Scanner;

public class ReverseTheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Reversing Station...");
        System.out.print("Please Enter Your Number:");
        int num = sc.nextInt();
        int reverse = reverse(num);
        System.out.println("After Reversing The Number Will be "+reverse);
    }
    public static int reverse(int num){
        int newNum=0;
        while(num>0){
            int digit=num%10;
            newNum=newNum*10+digit;
            num/=10;
        }
        return newNum;
    }
}
