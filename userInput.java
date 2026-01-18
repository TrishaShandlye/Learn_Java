import java.util.*;
public class userInput{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name = input.nextLine();
        System.out.println("Welcome" +name);

    }
}