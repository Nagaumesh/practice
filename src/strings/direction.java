package strings;
import java.util.*;
public class direction {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the directions: ");
        String dir=sc.nextLine();
        int h=0,v=0;//-------------------------------------horizontal and vertical
        for(int i=0;i<dir.length();i++){
            if(dir.charAt(i)=='N'){
                v++;
            }else if(dir.charAt(i)=='S'){
                v--;
            }else if(dir.charAt(i)=='E'){
                h--;
            }else if(dir.charAt(i)=='W'){
                h++;
            }
        }
        double sd=Math.sqrt((v*v)+(h*h));
        System.out.println("shortest distance: "+sd);
        System.out.print("shortest path: ");
        while(v>0){
            System.out.print("N");
            v--;
        }
        while(v<0){
            System.out.println("S");
            v++;
        }
         while(h>0){
            System.out.print("E");
            h--;
        }
        while(h<0){
            System.out.print("W");
            h++;
        }
    }
    

}
