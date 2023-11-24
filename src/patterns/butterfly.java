package patterns;
import java.util.*;
public class butterfly {

    public static void upper(int num){
        int starcount=1;
        int spacecount=(num-1)*2;
        //upper half of butterfly
        for(int i=1;i<=num;i++){
                for(int k=1;k<=starcount;k++){
                    System.out.print("*");
                } 
                for(int l=1;l<=spacecount;l++){
                    System.out.print(" ");
                } 
                for(int k=1;k<=starcount;k++){
                    System.out.print("*");
                } 
                starcount++;
                spacecount-=2;
                System.out.println();
            }
        }

        public static void lower(int num){

             //lowerhalf of butterfly
         int starcount=num;
        int spacecount=0;
        for(int i=1;i<=num;i++){
                for(int k=1;k<=starcount;k++){
                    System.out.print("*");
                } 
                for(int l=1;l<=spacecount;l++){
                    System.out.print(" ");
                } 
                for(int k=1;k<=starcount;k++){
                    System.out.print("*");
                } 
                starcount--;
                spacecount+=2;
                System.out.println();
            }

        }

        public static void butterfly(int num){
            upper(num);
            lower(num);
        }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter size of butterfly: ");
        int num=sc.nextInt();
        butterfly(num);
        }
    }
