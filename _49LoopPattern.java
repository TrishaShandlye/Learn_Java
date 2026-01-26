import java.util.Scanner;

public class _49LoopPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("We are here to Print Patterns..\n");
        System.out.print("Please Enter the No Of Rows: ");
        int rows = sc.nextInt();
        printRightHalfPyramid(rows);
        printReverseRightHalfPyramid(rows);
        printLeftHalfPyramid(rows);

    }

    public static void printReverseRightHalfPyramid(int rows) {
        System.out.println("\nHere is the Reverse Right Half Pyramid");
        int row = rows;
        while (row > 0) {
            int column = 0;
            while (column < row) {
                System.out.print(" *");
                column++;
            }
            System.out.println();
            row--;
        }

    }

    public static void printRightHalfPyramid(int rows) {
        System.out.println("\nHere is Right Half Pyramid");
        int row = 0;
        while (row < rows) {
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

    public static void printLeftHalfPyramid(int rows) {
        System.out.println("\nHere is the Left Half Pyramid");
        int row = rows;

        while (row > 0) {

            // print spaces
            int j = 1;
            while (j < row) {
                System.out.print("  "); // TWO spaces
                j++;
            }

            // print stars
            int column = 0;
            while (column <= (rows - row)) {
                System.out.print("* ");
                column++;
            }

            System.out.println();
            row--;
        }
    }

}
