public class _35Parameter {
    public static void main(String[] args) {
        System.out.println(sumTwoNumbers(4,7));
        System.out.println(sumTwoNumbers(9,5));
        System.out.println(sumTwoNumbers(8,-7));
        
    }
    public static int sumTwoNumbers(int first,int second){
        System.out.println("First Number Received:" +first);
        System.out.println("Second Number Received:" +second);
        int sum = first+second;
        return sum;
    }
}
