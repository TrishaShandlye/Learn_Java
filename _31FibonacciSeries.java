import java.util.Scanner;

public class _31FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci Series Station...");
        System.out.print("Please Enter Your Number:");
        int num = sc.nextInt();
        System.out.println("Fibonacci Series will be:");
        fibonacci(num);
    }
    public static void fibonacci(int num){
        if (num<0) return ;
        System.out.println("0");
        if(num==0) return ;
        System.out.println("1");
        int first =0; 
        int second= 1;
        while(first+second<=num){
            int third;
            third=first+second;
            System.out.println(third+" ");
            first=second;
            second=third;
        }

        
    }
}
