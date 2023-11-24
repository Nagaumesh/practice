package Graphs;
import java.util.*;
public class printingPaths {
    public static class Edge {
        int src;// source
        int dest;// destination

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
    public static void PrintPath(int src, int dest,ArrayList<Edge> graph[]){
        Stack<Integer> q=new Stack();
        util(src,dest,q,graph);
    }
    public static void util(int s,int d, Stack<Integer> q,ArrayList<Edge> graph[]){
        if(s==d){
        q.add(d);
         System.out.println(q);
         return; 
        } 
        for(int i=0;i<graph[s].size();i++){
             int so=graph[s].get(i).dest;
             q.push(s);
             util(so, d,q, graph);
             q.pop();
        }
    }
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        // 5--->0<----4
        // |    |     |
        // |    |     |
        // |    |     |
        // \/   \/    \/
        // 2---->3--->1
        graph[0].add(new Edge(0,3));

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
        PrintPath(5,1,graph);

    }
}
