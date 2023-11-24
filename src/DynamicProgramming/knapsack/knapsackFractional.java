package DynamicProgramming.knapsack;
import java.util.*;
public class knapsackFractional {
    public static PriorityQueue<items> pq=new PriorityQueue<>();
    public static class items implements Comparable<items>{
        int wt;
        int val;
        int ratio;
        items(int wt,int val){
            this.wt=wt;
            this.val=val;
            this.ratio=val/wt;
        }
        @Override
        public int compareTo(items i2){
            return i2.ratio-this.ratio; //descending order
        }
    }
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int w=7;
        float ans=0;
        for(int i=0;i<val.length;i++){
             pq.add(new items(wt[i],val[i]));
        }
        while(!pq.isEmpty()){
            items temp=pq.remove();
            if(temp.wt<=w){
                w=w-temp.wt;
                ans=ans+temp.val;
            }else{
                ans=ans+w*((float)temp.val/temp.wt);
                break;
            }
        }
        System.out.println(ans);
    }
}
