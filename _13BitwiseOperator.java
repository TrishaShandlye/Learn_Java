import java.util.Scanner;

public class _13BitwiseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Showcasing Bitwise Operator...");
        System.out.print("Enter first no:");
        int a = sc.nextInt();
        System.out.print("Enter second no:");
        int b = sc.nextInt();
        int and= a&b;
        System.out.println("AND Operator Result is: "+and);
        int or = a|b;
        System.out.println("OR Operator Result is: "+or);
        int xor  = a^b;
        System.out.println("XOR Operator Result is: "+xor);
        int not = ~a;
        System.out.println("NOT Operator Of A is: "+not);
        int leftshft = a<<1;
        //power calculate..2 ki power 1 se multiply ho jayegaa..2 rha shifting ka to 4 se
        System.out.println("Left Shift Operator Of A is: "+leftshft);
        int rightshft = a>>1;
        //2 ki power 1 se divide ho jayegaa..2 rha shifting ka to 4 se
        System.out.println("Right Shift Operator Of A is: "+rightshft);
    }
}
