public class Array {
    public static void main(String[] args) {
        //same declaration for string.....
        // int[] myArr=new int[6];
        // myArr[0]=3;
        // myArr[3]=433;
        // myArr[5]=973;
        // myArr[2]=4744;
        // myArr[4]=89;
        // myArr[1]=13;

        int[] myArr = { 3, 433, 973, 4744, 89, 13 };

        // System.out.println(myArr[0]);
        // System.out.println(myArr[1]);
        // System.out.println(myArr[2]);
        // System.out.println(myArr[3]);
        // System.out.println(myArr[4]);
        // System.out.println(myArr[5]);

        //Array Traversal
        int index=0;
        while(index<myArr.length){
            System.out.println(myArr[index]);
            index++;
        }
    }
}
