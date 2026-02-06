import java.util.Scanner;

public class _54OccurancesArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Array Occurances////");
        int[] numArray= _53ArrayUtility.inputArray();
        System.out.println("Now enter the number you want to find: ");
        int num=sc.nextInt();
        int occurances=noOfOccurances(numArray,num);
        System.out.println("Your element has been found "+occurances+" times in the array.");
    }
    public static int noOfOccurances(int[] numArr,int num){
        int occ = 0;
        int i=0;
        while(i<numArr.length){
            if(numArr[i]==num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
