package Arrays2D;
import java.util.*;
public class diagnolsum {
    public static void diagnolsum(int arr[][]){
        // primary diagnol   from left top to bottom right
        int sum=0;
        int k=0;
        while(k<=arr.length-1){
            sum=sum+arr[k][k];
            k++;
        }
        System.out.println("sum of primary diagnol: "+sum);

        //secondary diagnol
        int i=0;
        int j=arr[0].length-1;
         while(i<=arr.length-1){
            if(i==j){
                i++;
                j--;
            }
            sum=sum+arr[i][j];
            i++;
            j--;
        }
        System.out.println("sum of primary and secondary diagnols: "+sum);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        // diagnolsum(matrix);
        diagnolsum(arr);
    }
}
