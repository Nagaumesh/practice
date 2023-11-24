package Basic;
import java.util.*;
public class dec_bin {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("enter a decimal number: ");
    int num=sc.nextInt();
    int q,r,bin=0,i=0;

//quotient -q
//remainder -r
//duplicating a value of num
int var=num;
    do{
        q=num/2;
        r=num%2;
        bin=bin+(r*(int)Math.pow(10,i));
        num=q;
        i++;
    }while(q!=0);

    System.out.println("binary value of "+var+" is "+bin);
}
    
}
