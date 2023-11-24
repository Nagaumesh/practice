package Graphs;
import java.util.*;
//indegree- incoming arrows to a node
//out degree-outgoing arrows from a node
public class TopoBFS {
    public static class Edge {
        int src;// source
        int dest;// destination

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
    public static void indegree(ArrayList<Edge> graph[],int indeg[]){
        int v=graph.length;
        for(int i=0;i<v;i++){
            for(int j=0;j<graph[i].size();j++){
                int dest=graph[i].get(j).dest;
                indeg[dest]++;
            }
        }
    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(i+":"+arr[i]+" ");
        }
    }
    public static void utiladd(int indeg[],Queue<Integer> q){
         for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0){
                q.add(i);
                indeg[i]=-1;
            }
        }
    }
    public static boolean iszero(int indeg[]){
         for(int i=0;i<indeg.length;i++){
            if(indeg[i]!=-1){
               return false;
            }
        }
        return true;
    }
    public static void Topobfs(ArrayList<Edge> graph[],int indeg[]){
        Queue<Integer> q=new LinkedList<>();
        while(!iszero(indeg)){ // q.isEmpty()
            utiladd(indeg, q);
            int temp=q.remove();
            System.out.print(temp+" ");
            for(int i=0;i<graph[temp].size();i++){
                int dest=graph[temp].get(i).dest;
                indeg[dest]--;
            }
        }
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

        int indeg[]=new int[v];
        indegree(graph,indeg);
        System.out.print("indegrees-> ");
        printarray(indeg);
        System.out.print("\ntopological sort using bfs: ");
        Topobfs(graph, indeg);
        
    }
}
