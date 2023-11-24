package arrays;
import java.util.*;
import arrays.binarysearch.*;
public class binarysearch {
   
    public static int binarysearch(int arr[],int key){
        int start=0,end=arr.length-1,mid;
        do{
            mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            
            else if(arr[mid]>key){
            end=mid-1;
            }
            
            else{
                start=mid+1;
            }
        }while (start<=end);
        return -1;
                
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]={2,4,6,8,10,12,14};
        System.out.println(arr.length);
        System.out.print("enter the key");
        int key=sc.nextInt();
        int keyposition=binarysearch(arr,key);
        if(keyposition==-1){
            System.out.println("key is not there in array");
        }else{
            System.out.println("key "+key+" is at position: "+ keyposition);
        }
    }
}
