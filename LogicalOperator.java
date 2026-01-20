import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Discount Portal....");
        System.out.println("Please enter your age:");
        int age = sc.nextInt();
        System.out.println("Are You a Female: True/False");
        boolean gender = sc.nextBoolean();
        if(age<5){
            System.out.println("Yayyy! You Got 75% Discount");
        }
        else if(gender){
            System.out.println("You Got 50% Discount");
        }
        else if(age>50 && !gender){
            System.out.println("You Got 25% Discount");
        }
        else{
            System.out.println("Sorry..No Discount");
        }
    }
}
