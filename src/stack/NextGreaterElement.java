package stack;
import java.util.*;
public class NextGreaterElement {

    public static void nextgreater(int arr[],int nextGreater[]){
        Stack<Integer> s= new Stack<Integer>();
        for(int i=arr.length-1;i>=0;i--){

            while(!s.isEmpty() && arr[i]>arr[s.peek()] ){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }else{
                nextGreater[i]=arr[s.peek()];
            }
            
            s.push(i);
        }
       

    }
    
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int nextGreater[]=new int[arr.length];
        nextgreater(arr,nextGreater);
        for(int i=0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i]+" ");
        }
    }
    // it can come in 4 different forms
    // next greater right -above 
    // next greater left - change for  loop from 0 to 1
    // next smaller right- change whileloop condition
    // next smaller left-while loop cond and for loop i for 0
}
