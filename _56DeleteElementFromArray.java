import java.util.Scanner;

public class _56DeleteElementFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to delete: ");
        int del = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == del) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Element not found!");
            return;
        }
        int[] newArr = new int[n - count];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != del) {
                newArr[index++] = arr[i];
            }
        }
        System.out.println("Array after deletion:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
