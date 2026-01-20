import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You can Drive");
        }
        else{
            System.out.println("Sorry..You Can`t Drive");
        }

    }
}
