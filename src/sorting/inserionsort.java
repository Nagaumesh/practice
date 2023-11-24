package sorting;

public class inserionsort {
 
    public static void insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int cur=arr[i];
            int prev=i-1;
            // finding place to insert
            while(prev>=0 && arr[prev]>cur){
                arr[prev+1]=arr[prev];     
                prev--;
            }
            //insertion
            arr[prev+1]=cur;
        }
    }  
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    } 

    public static void main(String[] args) {
        int arr[]={5,3,6,8,1,2};
        insertionsort(arr);
        printarray(arr);
    }
}
