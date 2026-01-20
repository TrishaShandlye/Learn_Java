import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let`s Convert Temperature in Farenheit to Celcius...");
        System.out.println("Enter Temperature in Farenheit:");
        float a = sc.nextFloat();
        float b = (a-32)*5/9;
        System.out.println("Temperature in Celcius is:"+b+"Degree");
    }
}