public class TypeConversion {
    public static void main(String[] args) {
        //Implicit(Widenening)
        long big = 2;
        float dec = 54l;
        double d = 0.3f;
        System.out.println(big);
        System.out.println(dec);
        System.out.println(d);
        
        //Explicit(Narrowing)
        int hdec= (int) 64.0d;
        System.out.println(hdec);
    }
    
}
