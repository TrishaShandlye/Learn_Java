public class _11UnaryOperator {

    public static void main(String[] args) {
        int x=5;
        int y=-x;
        System.out.println(y);
        int z=-y;
        System.out.println(z);
        //Pre-increament=Increament the value by 1 and then use it in the statement.
        //Post-increament=Use the current value in the statement and then increase it by 1.
        int a=9;
        System.out.println(++a);
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);
        //Pre-decreament=Decreament the value by 1 and then use it in the statement.
        //Post-decreament=Use the current value in the statement and then decrease it by 1.
        int b=9;
        System.out.println(--b);
        System.out.println(b);
        System.out.println(b--);
        System.out.println(b);
    }
}