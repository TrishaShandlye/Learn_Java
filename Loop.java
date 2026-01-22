import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        /*int num = 1; //initialization
        while(num<=10){ //condition
            System.out.println(num);
            num=num+1;) //updation*/

          /*   int count=500;
            while(count>=400){
                System.out.println(count);
                count=count-1;
            }*/

                Scanner sc=new Scanner(System.in);
                int i = 0;
                while(i<5){
                    int input=sc.nextInt();
                    System.out.println("Number Is: "+input);
                    i=i++;
                }
        }
    }
    

