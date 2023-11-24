package Sets_hashmaps;
import java.util.*;
public class Union_intersection {
    public static HashSet union(int arr1[],int arr2[]){
        HashSet<Integer> ans=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            ans.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            ans.add(arr2[j]);
        }
        return ans;
    }
    public static HashSet intersection(int arr1[],int arr2[]){
        HashSet<Integer> ans =new HashSet<>();
        HashSet<Integer> ok =new HashSet<>();
        for(int i=0;i<arr1.length;i++){
             ans.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            if(ans.contains(arr2[j])){
               ok.add(arr2[j]);
            }
        } 
        return ok;
    }
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        System.out.println(union(arr1,arr2));
        System.out.println(intersection(arr1,arr2));
    }
}
