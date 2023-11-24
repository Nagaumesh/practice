package recursion.DivideAndConquer;

public class quicksort {

    public  static void quicky(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pivot=arr[ei];
        int i=si-1,temp,j;
        for( j=si;j<ei;j++){
            if(arr[j]<= pivot){
                i++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
           
        }
         i++;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        //left part of 1st iteration(before pivot)
        quicky(arr,si,i-1);
        //right part of 1st iteration(after pivot)
        quicky(arr,i+1,ei);
    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 
    public static void main(String[] args) {
        int arr[]={6,1,1,2,9,8,2};
        quicky(arr,0,arr.length-1);
        printarray(arr);
    }
    
}
