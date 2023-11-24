package GreedyApproach;
import java.util.*;
public class MaxLengthChains {
    
    public static void main(String[] args) {
        int a[]={5,39,5,27,50};
        int b[]={24,60,28,40,60};
        double link[][]=new double[a.length][2];
        for(int i=0;i<a.length;i++){
            link[i][0]=(double)a[i];//start
            link[i][1]=(double)b[i];//end
        }
        Arrays.sort(link,Comparator.comparingDouble(o->o[1]));
        Double lastfinished=link[0][1];
        System.out.println("("+link[0][0]+" ,"+link[0][1]+")");
        int count=1;
        for(int i=1;i<a.length;i++){
            if(lastfinished<link[i][0]){
                count++;
                lastfinished=link[i][1];
                System.out.println("("+link[i][0]+" ,"+link[i][1]+")");
            }
        }
        System.out.println("MaxLength of chains: "+count);
    }
}
