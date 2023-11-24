package Graphs;
import java.util.*;
public class basic {
    // by using adjacency list
    public static class Edge{
        int src;//source
        int dest;//destination
        int weight;//weight of the edge
        Edge(int src,int dest,int weight){
            this.src=src;
            this.dest=dest;
            this.weight=weight;
        }
    }

    public static void main(String[] args) {
        // int arr[]=new int[5];
        int v=5;//no of vertices
        ArrayList<Edge> graph[]=new ArrayList[v];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        
        //for adding
        graph[0].add(new Edge(0,1,5));
    }
    
}
