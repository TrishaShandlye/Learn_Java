import java.util.Scanner;

public class _38Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        int c,d,e,f,g;
        c=a+b;
        d=a-b;
        e=a*b;
        f=a/b;
        g=a%b;
        System.out.println("Addition is:"+c );
        System.out.println("Subtraction is:"+d );
        System.out.println("Multiplication is:"+e);
        System.out.println("Division is:"+f);
        System.out.println("Modulus is:"+g);
    }
}
