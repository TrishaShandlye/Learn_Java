import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={2,56,29,1,944,234};
        System.out.println("Welcome to Array Searching...");
        System.out.println("Enter the Number you want to search: ");
        int num=sc.nextInt();
        boolean isFound=isFound(arr,num);
        if (isFound){
            System.out.println("Your Number is Found in Array");
        }
        else{
            System.out.println("Your Number is not found in Array");
        }

    }
    public static boolean isFound(int[] arr,int num){
        int index=0;
        while(index<arr.length){
            if(arr[index]==num){
                return true;
            }
            index++;
        }
        return false;
    }
}
