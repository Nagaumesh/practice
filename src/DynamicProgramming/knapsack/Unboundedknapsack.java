package DynamicProgramming.knapsack;

public class Unboundedknapsack {
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7; // max weight
        // in unboundedknapsack you can select the same item multiple times
        System.out.println(MaxProfit(val, wt, W));
    }

    public static int MaxProfit(int val[],int wt[],int w){
        int n=val.length;
        int dp[][]=new int[n+1][w+1];

         for(int i=1;i<n+1;i++){
            for(int j=1;j<w+1;j++){
                int v=val[i-1]; // ith item as index start from 0, i-1
                int weight=wt[i-1];
                if(weight<= j){
                    int includeProfit= v + dp[i][j-weight]; // here j-w indicates the sack weight will be decreased after adding 
                    // here if you keep above i-1 you cant add same item multiple times if you keep i youcan add multiple times
                    // but in exclude condition its same cause once excluded its excluded.
                    int excludeProfit= dp[i-1][j];
                    dp[i][j]=Math.max(includeProfit,excludeProfit);
                }else{
                    int excludeProfit= dp[i-1][j];
                    dp[i][j]=excludeProfit;
                }
            }
         }
        return dp[n][w];
    }
}
// here the table of dp contains 
// i-- looking at ith item only
// j-- remaining space in the bag
// now make choices can fit or not fit
//if can fit include and exclude
