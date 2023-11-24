package arrays;

public class kadenmaxsub {
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int cs=0,ms=arr[0];
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
        //    if(ms<cs){
        //     ms=cs;
        //    } 
        ms=Math.max(cs,ms);
           if(cs<0){
            cs=0;
           }
        }
        System.out.println(ms);
    }
}
