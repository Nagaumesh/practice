package PriorityQueue;
import java.util.*;
public class NearestK {
    public static class car implements Comparable<car>{
        int x;
        int y;
        int dis;
        int idx;
        car(int x, int y,int idx){
            this.x=x;
            this.y=y;
            this.dis=(x*x)+(y*y);
            this.idx=idx;
        }
        @Override
        public int compareTo(car c2){
            return this.dis-c2.dis;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<car> pq=new PriorityQueue<>();
        int pts[][]={{3,3},{5,-1},{-2,4}};
       for(int i=0;i<pts.length;i++){
         pq.add(new car(pts[i][0],pts[i][1],i));
       }
        while(!pq.isEmpty()){
              System.out.println("C"+pq.remove().idx);
        }
      
    }
}
