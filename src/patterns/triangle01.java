package patterns;
import java.util.*;
public class triangle01 {
    public static int flip(int n){
        if(n==0){
            n=1;
        }else{
            n=0;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //0-1 triangle

        int num = sc.nextInt();
        int num1 = num;
        int count=1;
        int var=1;
        for (int j = 1; j <= num1; j++) {
            for (int i = 1; i <= var; i++) {
                System.out.print(count+" ");count=flip(count);
            }
            var++;
            num--;
            
            System.out.println();
        }
    }
}
