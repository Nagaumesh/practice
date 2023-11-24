package Basic;
import java.util.*;
public class bin_dec {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a binary number: ");
        int num = sc.nextInt();
        int i=0,temp,temp2,decimal=0;
        // 101 = [2^0]*1+ [2^1]*0
        while(num!=0){
            temp = num%10;
            temp2 =(int) Math.pow(2,i);
            decimal=decimal+(temp*temp2);
            i++;
            num=num/10;
        }
        System.out.println("respective decimal value: "+decimal);
    }
}
