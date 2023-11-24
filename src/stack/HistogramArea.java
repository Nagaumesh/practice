package stack;
import java.util.*;
public class HistogramArea {

    public static int maxarea(int arr[]){
        int left,right,area,height,width,i,maxarea=Integer.MIN_VALUE;
        for(int var=0;var<arr.length;var++){
            i=var;
            left=i;
            //left
           while((i-1)>=0 && arr[i-1]>=arr[var] ){
            i--;
           }
            left=i;
            // System.out.println(left);
            i=var;
            while((i+1)<=arr.length-1 && arr[i+1]>=arr[var]){
                i++;
            }
            right=i;
            // System.out.println(right);
            height=arr[var];
            width=right-left+1;
            area=height*width;
            maxarea=Math.max(maxarea,area);
        }
        return maxarea;
    }
    
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        // maxarea(arr);
        int ans=maxarea(arr);
        System.out.println(ans);
    }
}
