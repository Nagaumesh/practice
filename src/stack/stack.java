package stack;
import java.util.*;

public class stack {
    public static void pushbottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushbottom(s,data);
        s.push(top);
    }
  
    public static StringBuilder reversestr(Stack<Character> s){
        StringBuilder rev=new StringBuilder("");
        while(!s.isEmpty()){
            System.out.println(s.peek());
            rev.append(s.peek());
            s.pop();
    
        }
        return rev;
    }
     public static void reverse(Stack <Integer> s){
            if(s.isEmpty()){
                return;
            }
            int top=s.pop();
            reverse(s);
            pushbottom(s,top);
           
        }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // pushbottom(s, 4);
        // System.out.println(s);
        // reverse(s); 
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }


        // Stack<Character> s=new Stack<>();
        // s.push('u');
        // s.push('m');
        // s.push('e');
        // s.push('s');
        // s.push('h');
        // String str="umesh";
        // System.out.println(reversestr(s));
    }
}
