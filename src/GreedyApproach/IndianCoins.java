package GreedyApproach;
import java.util.*;
public class IndianCoins {

    public static void main(String[] args) {
        int []denominations={1,2,5,10,20,50,100,500,2000};
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the amount to be generated:");
        int amount =sc.nextInt();
        int i=denominations.length-1;
        int coins=0;
        while(amount!=0){
            if(denominations[i]<=amount){
                coins=coins+(amount/denominations[i]);
                System.out.print(denominations[i]+"*"+(amount/denominations[i])+" ");
                amount = amount -((amount/denominations[i])*denominations[i]);
                
                i--;
            }else{
                i--;
            }
        }
        System.out.println("\ncoins: "+coins);
       
    }
    
}
