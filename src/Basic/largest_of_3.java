package Basic;

import java.util.Scanner;
public class largest_of_3 {
    public static void main(String[] args)  {
       int a,b,c;
       Scanner sc =new Scanner(System.in);
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       if(a>=b && a>=c){
        System.out.println(a);
       }
       else if(b>=a && b>=2){
            System.out.println(b);
       }
       else{
        System.out.println(c);
       }
       
    }
}
