package sorting;

public class bubblesort {

    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void bubblesort(int arr[]){
        int temp;
        for(int i=0;i<arr.length-1;i++){                   // i represents no of digits to be sorted to sort an array
            for(int j=0;j<arr.length-i-1;j++){             // j represents no of swappings shoould we check to sort a digit
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        bubblesort(arr);
        printarray(arr);
        
    }
    
}
