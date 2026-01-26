import java.util.*;
public class _16userInput{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name = sc.nextLine();
        System.out.println("Welcome " +name);
        System.out.println(name+ " Also tell me your age");
        int age=  sc.nextInt();
        System.out.println("Your Age Is: "+age );
    }
}