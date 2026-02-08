public class IsSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Sorting Checkpost///");
        int[] numArray=_53ArrayUtility.inputArray();
        boolean inc=IsIncreasing(numArray);
        boolean dec=IsDecreasing(numArray);
        if(inc || dec){
            System.out.println("Your Array Is Sorted..");
        }
        else{
            System.out.println("Your Array Is Not Sorted..");
        }
    }
    public static boolean IsIncreasing(int[]numArray)
    {
        int i=1;
        while(i<numArray.length){
            if(numArray[i]<numArray[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean IsDecreasing(int[]numArray){
        int i=1;
        while(i<numArray.length){
            if(numArray[i]>numArray[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
