package Graphs.Connected_graphs;
import java.util.*;
public class Cycledetection {
    public static class Edge {
        int src;// source
        int dest;// destination
        int weight;// weight of the edge

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }
     
    public static boolean DetectCycle(ArrayList<Edge> graph[],int src){
        boolean visited[]=new boolean[graph.length];
        Detectutil(graph,visited,src,-1);
        for(int i=0;i<graph.length;i++){
            if(visited[i]==false){
                if(Detectutil(graph, visited, i,-1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean Detectutil(ArrayList<Edge> graph[],boolean visited[],int src,int parent){
        for(int i=0;i<graph[src].size();i++){
            if(visited[src]==true && parent!=graph[src].get(i).dest){
                return true; // loop exists
            }
            visited[src]=true;
            if(visited[graph[src].get(i).dest]==false){
                visited[graph[src].get(i).dest]=true;
                Detectutil(graph, visited, graph[src].get(i).dest,src);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge> graph[]=new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }
        
        //       0------3
        //     / |       
        //   1   |
        //     \ |
        //       2------4

        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));
        graph[0].add(new Edge(0,3,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,0,1));
        // graph[3].add(new Edge(3,4,1));

        graph[4].add(new Edge(4,2,1));
        // graph[4].add(new Edge(4,3,1));
 
        System.out.println(DetectCycle(graph,0));
        
    }
}
