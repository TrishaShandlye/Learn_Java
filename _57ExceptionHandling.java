public class _57ExceptionHandling {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int c = a / b;   // error happens here
            System.out.println(c);
        }

        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

    }
}
    

