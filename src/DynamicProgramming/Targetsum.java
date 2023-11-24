package DynamicProgramming;
import java.util.*;
// can think similar to knapsack every for element it has two options to consider or to not consider

public class Targetsum {
    
    public static void target(int num[], int total,int dp[][]){
        for(int i=0;i<num.length;i++){
            int sum=num[i];
            for(int j=i+1;j<num.length;j++){
                // if(dp[i][j]!=-1){
                //     sum=
                // }
                dp[i][j]=sum=sum+num[j];
                if(sum==total){
                    System.out.println("from "+i+" to "+j);
                }
            }
        }
    }
    public static void main(String[] args) {
        int num[]={8,2,7,1,3};
                // 0,1,2,3,4
        int sum=10;
        int dp[][]=new int[num.length][num.length];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        target(num, sum,dp);
    }
}
