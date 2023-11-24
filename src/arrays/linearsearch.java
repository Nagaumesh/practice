package arrays;
import java.util.*;
public class linearsearch {

    public static void linearsearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("found the element at position: "+i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]={1,2,3,4,56,78,56,21,30,22};
        int key=sc.nextInt();
        linearsearch(arr,key);

    }
}
