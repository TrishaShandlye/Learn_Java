import java.util.Scanner;

public class GreatestAmongThree {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Three Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if( a>=b && a>=c){
            System.out.println(a + " is the Greatest");
         }
         else if (b>=c){
            System.out.println(b +" is the Greatest");
         }
         else{
            System.out.println(c +" is the Greatest");
         }
    }
}
