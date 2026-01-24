import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to LCM Station...");
        System.out.print("Please Enter Your First Number:");
        int first = sc.nextInt();
        System.out.print("Please Enter Your Second Number:");
        int second = sc.nextInt();
        int lcm = lcm(first, second);
        System.out.println("Least Common Multiplication Of The Two Numbers is: "+lcm);
    }
    public static int lcm(int first,int second) {
        int i=1;
        while(i<=second){
            int factor=first*i;
            if(factor%second==0){
                return factor;
            }
            i++;
        }
        return 0;
        
    }
}
