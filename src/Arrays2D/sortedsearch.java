package Arrays2D;
import java.util.*;
public class sortedsearch {
    public static void search(int arr[][],int key){
        int row=arr[0].length-1;
        int coloumn=0;
        boolean status=false;
        // int temp= arr[row][coloumn];
        while(row<arr.length && coloumn<arr[0].length){
            int temp= arr[row][coloumn];
            if(key>temp){
                if(coloumn==arr[0].length-1){
                    break;
                }
                coloumn++;
            }
            else if(key<temp){
                 if(row==0){
                    break;
                }
                row--;
            }
            else{
                status=true;
                System.out.println(key+" key is found"+ " at position: "+"("+row+","+coloumn+")");
                break;
            }
        }
        if(status==false){
            System.out.println("element not found");
        }
        
    }
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the key: ");
        int key= sc.nextInt();
        search(arr,key);
        
    }
}
