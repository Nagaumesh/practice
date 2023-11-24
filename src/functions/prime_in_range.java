package functions;

import java.util.*;

public class prime_in_range {

    // optimal solution for prime
public static boolean isprime(int n){
    boolean isprime=true;
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
        isprime =false;
        }
    }
    return isprime;
}

// using a function in function.
public static void primeinrange(int n){
    for(int i=1;i<=n;i++){
        if(isprime(i)==true){
            System.out.print(i+" ");
        }
    }
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("enter the no to check  wether given num is prime or not: ");
        // int num = sc.nextInt();
        // System.out.println(isprime(num));

        System.out.print("enter number to get primes in that range: ");
        int num = sc.nextInt();
        primeinrange(num);


    }

}
