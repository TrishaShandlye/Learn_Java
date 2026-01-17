import java.util.*;
public class Escape{
    public static void main(String[] args){
        //backspace ignores the next text
        System.out.println("Hello \"Trisha\" ");
        System.out.println("Hello \'Trisha\' ");
        System.out.println("Hello \\Trisha\\ ");
        System.out.println("Hello \nTrisha ");
        System.out.println("Hello\tTrisha ");
        System.out.println("Hello\bTrisha ");
    }
}