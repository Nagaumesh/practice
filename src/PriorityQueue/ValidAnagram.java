package PriorityQueue;
import java.util.*;
public class ValidAnagram {
     public static boolean isvalid(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        PriorityQueue <Character> pq= new PriorityQueue<>();
        PriorityQueue <Character> pq2= new PriorityQueue<>();
        for (int i=0;i<s.length();i++) {
            pq.add(s.charAt(i));
            pq2.add(t.charAt(i));
        }
       //insted of 2 queues take a single queue a nd delete by comparing if null true..
        for(int i=0;i<t.length();i++){
            if(pq.remove()==pq2.remove()){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="heart";
        String t="earth";
        System.out.println(isvalid(s,t));
    }
}
