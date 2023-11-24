package sorting;

public class selectionsort {
    public static void selectionsort(int arr[]){
                                                
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;                               //smallestnumber-index
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
               
            }
             int temp=arr[minpos];
                arr[minpos]=arr[i];
                arr[i]=temp;
        }

    }

    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,3,6,8,1,2};
        selectionsort(arr);
        printarray(arr);
    }
    
}
