package functions;
import java.util.*;
// binomial coefficent means ncr=n!/r!*(n-r)!
public class binomial_coeff {

    public static int factorial(int n){
        int fact=1;
        for(int i =1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the values of n and r respectively in nCr: ");
        int n =sc.nextInt();
        int r =sc.nextInt();
        int ncr = ( factorial(n) )/(factorial(r) * factorial(n-r));
        System.out.println("value of nCr is : "+ncr);
    }
}
