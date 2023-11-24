package arrays;
import java.util.*;
public class reversearray{
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void reversearray(int arr[]){
        int j=arr.length-1;
        int temp;
        for(int i=0;i<(arr.length/2);i++){           // can also be written as while(i<j)
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
    }

    public static void pairs(int arr[]){
        for(int i=0;i<arr.length-2;i++){
                for(int j=i+1;j<=arr.length-1;j++){
                    System.out.print("("+arr[i]  +   ","  +    arr[j]     +")   ");
                }
                System.out.println();
        }
    }

    public static void subarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){                       //arr={1,2,3}-subarray
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        // reversearray(arr);
        // printarray(arr);
        // pairs(arr);
        subarray(arr);

    }
}
