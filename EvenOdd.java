import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("It`s a Even Number");
        }
        else System.out.println("It is a Odd Number");
    }
}
