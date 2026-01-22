public class Function {
    public static void main(String[] args) {
        System.out.println("In Main Method");
        greetUser();

        printFirstPattern();
        System.out.println("Method Calling Complete");

    }

    public static void printFirstPattern() {
        int row = 0;
        while (row < 5) {
            System.out.print("*");
            int column = 0;
            while (column < row) {
                System.out.print(" *");
                column++;

            }
            System.out.println();
            row++;
        }
    }

    public static void greetUser() {
        System.out.println("Good Morning");
    }
}
