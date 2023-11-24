package queue;
import java.util.*;
public class usingstack{
    static Stack<Integer> s1=new Stack<>();
    static Stack<Integer> s2=new Stack<>();
    // using push -o(n) with 2 stacks to perform queue
    public void add(int data){
        //transfer to s2
        while(! s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int remove(){
        return s1.pop();
    }
    public int peek(){
        return s1.peek();
    }
    public static void main(String[] args) {
        usingstack us=new usingstack();
        us.add(1);
        us.add(2);
        us.add(3);
        System.out.println(s1);
    }
}