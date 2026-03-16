import java.util.Scanner;

public class BitStuffing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter bit stream: ");
        String data = sc.nextLine();

        String stuffed = "";
        int count = 0;

        for(int i = 0; i < data.length(); i++) {
            char bit = data.charAt(i);
            stuffed += bit;

            if(bit == '1') {
                count++;
                if(count == 5) {
                    stuffed += '0';
                    count = 0;
                }
            } else {
                count = 0;
            }
        }

        System.out.println("Stuffed bit stream: " + stuffed);
    }
}
