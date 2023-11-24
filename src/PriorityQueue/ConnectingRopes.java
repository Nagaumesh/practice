package PriorityQueue;
import java.util.*;
public class ConnectingRopes {
    public static void main(String[] args) {
        int ropes[]={4,3,2,6};
        PriorityQueue <Integer> pq =new PriorityQueue<>();
        for(int i=0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }
        int cost=0;
        while(pq.size()!=1){
            int sum=pq.remove()+pq.remove();
            cost=cost+sum;
            pq.add(sum);
        }
        System.out.println(cost);
    }
}
