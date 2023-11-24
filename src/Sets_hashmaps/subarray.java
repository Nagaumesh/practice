package Sets_hashmaps;

import java.util.*;
// find maximum subarray length possible such that the sum is zero 

public class subarray {

    public static class info {
        int length;
        int si; // starting index
        int ei;// ending index

         info(int length, int si, int ei) {
            this.length = length;
            this.si=si;
            this.ei=ei;
        }
    }

    public static info answer(int arr[]) { //zero
        HashMap <Integer,Integer> hm= new HashMap<>();
        int sum=0,si=-1,ei=-1,len=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(!hm.containsKey(sum)){
                hm.put(sum,i);
            }else{
                int temp=i-hm.get(sum); //temporary length
                if(len<temp){
                    len=temp;
                    si=hm.get(sum)+1;
                    ei=i;
                }
            }
        }
        return  new info(len,si,ei);
    }

    public static boolean iscontain(HashMap<Integer,Integer> hm,int var){
        // to search does hm contain a number that is +k times
    
                for(int key:hm.keySet()){
                        if(key==var){
                           return true; 
                        }
                }
                return false;
    }

    public static int answer(int arr[],int k) { // for the subarray sum=k
        HashMap <Integer,Integer> hm= new HashMap<>();
        int sum=0,si=-1,ei=-1,len=0;
        int count=0;
        int var=sum-k;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(!hm.containsKey(var)){
                hm.put(sum,i);
            }else{
                count++;
                si=hm.get(var);
                ei=i;
                for(int j=si;j<=ei;j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
        }
        return count;
    }

   

    public static void main(String[] args) {
        int arr[] = { 15, -2, 2, -8, 1, 7, 10 };
        Scanner sc=new Scanner(System.in);
        info ans=answer(arr);
        System.out.println("maximum length:"+ans.length);
        int si=ans.si;
        int ei=ans.ei;
        for(int i=si;i<=ei;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("--------------------------------------------");
        int count=answer(arr,6);
        System.out.println("count: "+count);
        
    }

}
