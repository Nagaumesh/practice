package Hashmap;
import java.util.*;
public class MajorityElement {
    // question- array length n . print numbers which are > n/3 in array
    public static void main(String[] args) {
        // int arr[]={1,3,2,5,1,3,1,5,1};
        int arr[]={1,2}; 
        int n=arr.length;
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                int value=hm.get(arr[i]);
                hm.put(arr[i],++value);
            }else{
                hm.put(arr[i],1);
            }
        }
        System.out.println(hm);
        System.out.println(hm.keySet());
        for (int i : hm.keySet()) {
            if(hm.get(i)>n/3){
                System.out.print(i+" ");
            }
        }
        
    }
    
    
}
