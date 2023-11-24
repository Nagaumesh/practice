package arrays;
import java.util.*;
public class maxsubarray {

    public static void maxsubarray(int arr[]){
        int maxsum=arr[0],sum=0,sum1=0;
        int prefixarr[]=new int[arr.length];
        prefixarr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
           prefixarr[i]=prefixarr[i-1]+arr[i];
        }
        // printarray(prefixarr);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                sum=0;                       //arr={1,2,3}-subarray                             i=start,j=end
                // for(int k=i;k<=j;k++){
                //     sum=sum+arr[k];                   -------1st optimized version
                // }
                sum= i==0 ?prefixarr[j]:prefixarr[j]-prefixarr[i-1];        //2nd optimized if u use only formula the array can get put pf bounds if start/i =0
                if(maxsum<sum){
                    maxsum=sum;
                }
            }
        }
        System.out.println(maxsum);
    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]={1,2,3,-9,9,0};
        maxsubarray(arr);

    }
}
