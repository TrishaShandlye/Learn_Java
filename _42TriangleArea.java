import java.util.Scanner;

public class _42TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base:");
        float a = sc.nextFloat();
        System.out.println("Enter height:");
        float b = sc.nextFloat();
        float c = 0.5f*a*b;
        System.out.println("Area of Triangle:"+c);
    }
    
}
