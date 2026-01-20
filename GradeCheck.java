import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please.Enter Your Percentage:");
        int grade = sc.nextInt();
        if(grade>=90){
            System.out.println("You got 'A'");
        }
        else if(grade>=75 ){
            System.out.println("You Got 'B'");
        }
        else if(grade>=60 ){
            System.out.println("You Got 'C'");
        }
        else if(grade>=30 ){
            System.out.println("You Got 'D'");
        }
        else{
            System.out.println("*F");
        }
    }
}
