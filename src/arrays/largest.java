package arrays;
import java.util.*;
public class largest {

    public static int biggest(int arr[]){
        int biggest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>biggest){
                biggest=arr[i];
            }
        }
        return biggest;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,77,576,54,634,53};
        int largest_num=biggest(arr);
        System.out.println("largest number in the array is: "+largest_num);

    }
}
