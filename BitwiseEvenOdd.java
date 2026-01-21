import java.util.Scanner;

public class BitwiseEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to Check whether it is Odd or Even: ");
        int num = sc.nextInt();
        if((num & 1) == 1){
            System.out.println("It is a Odd Number.");
        } 
        else{
            System.out.println("It is an Even Number.");
        }
    }
}
