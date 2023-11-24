package arrays;

public class stocks {
    public static void main(String[] args) {
         int prices[]={7,1,5,3,6,4};
         int bp=Integer.MAX_VALUE;
         int maxprofit=0,profit;
         //bp -buying price
         //sp- selling price

         for(int i=0;i<prices.length;i++){
            bp=Math.min(bp,prices[i]);
            if(bp<prices[i]){
                profit=prices[i]-bp;
                maxprofit=Math.max(profit,maxprofit);
            }   
           
         }
         System.out.println(maxprofit);

    }
}
