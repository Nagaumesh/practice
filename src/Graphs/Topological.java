package Graphs;
import java.util.*;
//video number 29.3 and 29.2
import Arraylists.stack;
//topological is mainly used to perform actions which need pre-re
public class Topological {

    public static class Edge {
        int src;// source
        int dest;// destination

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void TopologicalSort(ArrayList<Edge> graph[]){
        int v=graph.length;
        boolean visited[]=new boolean[v];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<v;i++){
            if(visited[i]==false){
                util(graph,i,visited,s);
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
    //using dfs
    private static void util(ArrayList<Edge> graph[],int num,boolean visited[],Stack<Integer> s){
       visited[num]=true;
       for(int i=0;i<graph[num].size();i++){
        int child=graph[num].get(i).dest;
        if(visited[child]==false){
            util(graph,child,visited,s);
        }
       }
       s.push(num);
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        // 5--->0<----4
        // |          |
        // |          |
        // |          |
        // \/        \/
        // 2---->3--->1

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
        TopologicalSort(graph);

    }

}
