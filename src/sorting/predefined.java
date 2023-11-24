package sorting;
import java.util.*;
public class predefined {

    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={7,4,6,3,5,2,1};
        // Arrays.sort(arr);
        // printarray(arr);

        // for sorting a fixed indexin array
        // Arrays.sort(arr,2,5); //excluding the last index number
        //  printarray(arr);

        //descending order
        Arrays.sort(arr,Collections.reverseOrder()); //- here to make this collection function work replace int with Integer everywhere
        printarray(arr);   
    

    }
}
