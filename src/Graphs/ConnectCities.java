package Graphs;
import java.util.*;
public class ConnectCities {
    public static class Edge implements Comparable<Edge> {
        int dest;// destination
        int cost;

        Edge( int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }
        @Override
        public int compareTo(Edge e2){
            return this.cost-e2.cost; // ascending order
        }
    }
    public static int connect(int cities[][]){
        PriorityQueue<Edge> pq=new PriorityQueue<>();
        boolean visited[]=new boolean[cities.length];
        pq.add(new Edge(0,0));
        int ans=0;
        while(!pq.isEmpty()){
            Edge e=pq.remove();
            if(visited[e.dest]==false){
                visited[e.dest]=true;
                ans=ans+e.cost;
                for(int i=0;i<cities[e.dest].length;i++){
                    if(cities[e.dest][i]==0){
                        continue;
                    }
                    pq.add(new Edge(i,cities[e.dest][i]));
                }
            }
        }
        System.out.println(ans);
        return ans;
    }
    public static void main(String[] args) {
        int cities[][]={
        {0,1,2,3,4},
        {1,0,5,0,7},
        {2,5,0,6,0},
        {3,0,6,0,0},
        {4,7,0,0,0}
        };
        System.out.println(connect(cities));
    }
}
