package DynamicProgramming.knapsack;
import java.util.*;
public class Knapsack01{
   public static void knapsack(int[]val,int[]wt,int w){
     int dp[][]=new int[val.length+1][w+1];
    for(int i=0;i<dp.length;i++){
        for(int j=0;j<dp[0].length;j++){
            dp[i][j]=-1;
        }
    }
    util(val,wt,w,0,0,dp);
    
   }
   public static int sol;
   public static void util(int[]val,int[]wt,int w,int i,int ans,int dp[][]){
    sol=Math.max(sol,ans);
    if(i>val.length-1 || w==0){
        return;
    }
       if(wt[i]<=w){
            util(val,wt,w-wt[i],i+1,dp[i][w]=ans+val[i],dp);//include
            util(val,wt,w,i+1,ans,dp);//exclude
            
       }else{
         util(val,wt,w,i+1,ans,dp);//exclude
       }
       
   }
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int w=7;
        
        knapsack(val,wt,w);
        System.out.println(sol);
    }
}