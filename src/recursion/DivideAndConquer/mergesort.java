package recursion.DivideAndConquer;

public class mergesort {
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 
    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        
        int mid=si+(ei-si)/2; //this is same as si+ei/2
        //left
         mergeSort(arr,si,mid);
        //right
        mergeSort(arr,mid+1,ei);
        //merging
        merging(arr,si,mid,ei);
    }
    public static void merging(int arr[],int si,int mid,int ei){
        int i=si; // leftpart index tracker
        int j=mid+1; //rightpart indextracker
        int temp[]=new int[ei-si+1];
        int k=0;//to track the index of temp array
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //left overs

        //left leftovers
        while(i<=mid){
            temp[k]=arr[i];
            i++;k++;
        }
        //right array leftovers
        while(j<=ei){
            temp[k]=arr[j];
            k++;j++;
        }
        for( k=0,i=si;k<temp.length;k++,i++){
                arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr,0,5);
        printarray(arr);
    }
}
