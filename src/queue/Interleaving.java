package queue;
import java.util.*;
public class Interleaving {
    
    static public Queue<Integer> q=new LinkedList<>();
    public static void interleaving(){
        Queue<Integer> qt=new LinkedList<>();
        int n=q.size();
        for(int i=0;i<n/2;i++){
            qt.add(q.remove());
        }
        //qt stores the first  half
        for(int i=0;i<n/2;i++){
            q.add(qt.remove());
            q.add(q.remove());
        }

    }

    public static void reversal(){
        Stack<Integer> s= new Stack<>();
        int n=q.size();
        for(int i=0;i<n;i++){
            s.push(q.remove());
        }
        for(int i=0;i<n;i++){
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        // let the question be 0123456789 you should make it 0516273849
         for(int i=1;i<11;i++){
            q.add(i);
         }
         System.out.println(q);
        //  interleaving();
        reversal();
         System.out.println(q);
    }
    
}
