package stack;
import java.util.*;
public class usingqueue {
    static Queue<Integer> q1=new LinkedList<>();
    static Queue<Integer> q2=new LinkedList<>();

    public static boolean isEmpty(){
        return q1.isEmpty() && q2.isEmpty();
    }
    
    public static void add(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }else{
                q2.add(data);
            }
    }

    public static int remove(){
        if(!q1.isEmpty()){
            while(true){
                q2.add(q1.remove());
                if(q1.size()==1){
                    return q1.remove();
                }
            }
        }else{
             while(true){
                q1.add(q2.remove());
                if(q2.size()==1){
                    return q2.remove();
                }
            }

        }
    }
    public static void print(){
        if(q1.isEmpty()){
            while(!q2.isEmpty()){
                System.out.println(q2.remove());
            }
        }else{
            while(!q1.isEmpty()){
                System.out.println(q1.remove());
            }
        }
    }

public static void main(String[] args) {
    add(1);
    add(2);
    add(3);
    remove();
    print();
     
}
}
