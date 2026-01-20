import java.util.Scanner;

public class CategorizedAgeGroup {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age = sc.nextInt();
        if(age>=60){
            System.out.println("You are a Senior Citizen.");
        }
        else if(age>=20 && age<60){
            System.out.println("You are an Adult.");
        }
        else if(age>=13 && age<20){
            System.out.println("Hello Teenager");
        }
        else{
            System.out.println("Heyy Kiddo");
        }
    }
}

