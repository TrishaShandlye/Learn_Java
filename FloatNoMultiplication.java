import java.util.Scanner;

public class FloatNoMultiplication{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no:");
        float a = sc.nextFloat();
        System.out.println("Enter second no:");
        float b = sc.nextFloat();
        float c = a*b;
        System.out.println("Multiplication is:"+c);
    }
    
}
