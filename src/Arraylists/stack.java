package Arraylists;
import java.util.*;
public class stack {
    public static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();
        //push
        public  void push(int data){
            list.add(data);
        }
        //pop
        public  int pop(){
            if(list.size()==0){
                System.out.println("no element to pop");
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peak
        public  int peak(){
            return list.get(list.size()-1);
        }
        // is empty
        public boolean isempty(){
            if(list.size()==0){
                return true;
            }else{
                return false;
            }
        }
        
    }

    public static void main(String[] args) {
        Stack s =new Stack();
         s.push(1) ;
         s.push(2);
         s.push(3);
         while(!s.isempty()){
            System.out.println(s.pop());
         }
    }
}
