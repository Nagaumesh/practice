package GreedyApproach;
import java.util.*;
public class MinAbsolutediff {
    public static int abs(int x,int y){
        return x-y>0 ? x-y:-1*(x-y);
    }
    public static ArrayList<Integer> ans=new ArrayList<>();
    
    public static void MinAbsoluteDifference(int a[],int b[]){
        Arrays.sort(a);
        Arrays.sort(b);
        int mindistance=0;
        for(int i=0;i<a.length;i++){
            mindistance=mindistance+abs(a[i],b[i]);
        }    
        System.out.println("Min-Distance :"+mindistance);
    }

    public static void main(String[] args) {
        int a[]={4,1,8,7};
        int b[]={2,3,6,5};
        MinAbsoluteDifference(a, b);
    
    }
}
