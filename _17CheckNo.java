import java.util.Scanner;

public class _17CheckNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number:");
        int no = sc.nextInt();

        if(no>0){
            System.out.println(no + " is a Positive No.");
        }
        else if(no<0){
            System.out.println(no + " is a Negative No.");
        }
        else{
            System.out.println("It is zero");
        }
    }
}
