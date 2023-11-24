package Graphs;
import java.util.*;
// insted of calling the function again u can add the possible values to queue and remove and peroformsame operation
public class CheapestFlight {
     public static class Edge {
            int src;// source
            int dest;// destination
            int wt;
    
            Edge(int src, int dest, int wt) {
                this.src = src;
                this.dest = dest;
                this.wt = wt;
            }
        }
    private static PriorityQueue<Integer>pq=new PriorityQueue<>();
    public static int cheapest(ArrayList<Edge> graph[],int src,int dest,int stops){
        util(graph, src, dest, stops,0);
        System.out.println("cheapest fare with: "+stops+" stops is "+pq.peek());
        return pq.peek();
    }
    
    public static void util(ArrayList<Edge> graph[],int src,int dest,int stops,int cost){
        int v=graph.length;
        if(stops<-1){
            return;
        }
        if(src==dest){
            pq.add(cost);
            // System.out.println(cost);
            return ;
        }
        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            util(graph,e.dest,dest,stops-1,cost+e.wt);
        }
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[3];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        //        0-->1
        //         \  |
        //         \/ \/  
        //           2       
        graph[0].add(new Edge(0,1,100)); 
        graph[0].add(new Edge(0,2,500));  
        graph[1].add(new Edge(1,2,100));
        System.out.println(cheapest(graph,0,2,1));
    }
}
