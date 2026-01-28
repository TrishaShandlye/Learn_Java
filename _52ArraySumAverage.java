import java.util.Scanner;

public class _52ArraySumAverage {

    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Array Sum And Average...");
        System.out.print("Please Enter the Number Of Elements: ");
        int size = sc.nextInt();

        int[] nums = new int[size];
        int i = 0;

        while (i < size) {
            System.out.println("Please Enter Element Number: " + (i + 1));
            nums[i] = sc.nextInt();
            i++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = inputArray();
        System.out.println("Array elements are:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

