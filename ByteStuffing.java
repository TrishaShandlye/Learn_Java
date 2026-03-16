import java.util.Scanner;

public class ByteStuffing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter data string: ");
        String data = sc.nextLine();

        char FLAG = 'F';
        char ESC = 'E';

        String stuffed = "" + FLAG;

        for(int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);

            if(ch == FLAG || ch == ESC) {
                stuffed += ESC;
            }
            stuffed += ch;
        }

        stuffed += FLAG;

        System.out.println("Stuffed data: " + stuffed);
    }
}
