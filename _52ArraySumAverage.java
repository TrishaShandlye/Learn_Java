import java.util.Scanner;

public class _52ArraySumAverage {
    public static void main(String[] args) {
       System.out.println("Welcome to Array Sum and Average:");
       int[] numArray = _53ArrayUtility.inputArray();
       long sum= sum(numArray);
       int avg= average(numArray);
       System.out.println("Sum of the Numbers is: "+sum);
       System.out.println("Average of the Numbers is: "+avg);
    }
    public static long sum(int[] numArray){
        long sum=0;
        int i=0;
        while(i<numArray.length){
            sum+=numArray[i];
            i++;
        }
        return sum;
    }

     public static int average(int[] numArray){
        long sum=sum(numArray);
        return (int)(sum/numArray.length);
    }

}
