package Graphs.Connected_graphs;
import java.util.*;
public class DFS {
    public static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int src, int dest,int wt){
            this.dest=dest;
            this.src=src;
            this.wt=wt;
        }
    }
    // this is for connected graphs that means it is called a single graph even if they are not connected
    //this is how we traverse such trees
   public static void Dfs(ArrayList<Edge> graph[],int src,boolean visit[]){
    Dfs_sub(graph,src,visit);
    for(int i=0;i<graph.length;i++){
        if(visit[i]==false){
            Dfs_sub(graph,i,visit);
        }
    }
   }
    
     public static void Dfs_sub(ArrayList<Edge> graph[],int src,boolean visit[]){
       if(visit[src]==false){
        visit[src]=true;
        System.out.print(src+" ");
        for(int i=0;i<graph[src].size();i++){
             Edge e=graph[src].get(i);
             if(visit[e.dest]==false){
                Dfs(graph,e.dest,visit);
             }
        }
       }
     }
    
    public static void main(String[] args) {
        // int arr[]=new int[8];
       ArrayList<Edge> graph[]=new ArrayList[9];
       boolean visit[]=new boolean [graph.length];

            //     1 ---3
            //   /      |  \
            //  0       |   5--6      7--8
            //   \      | /
            //    2-----4
        
            for(int i=0;i<graph.length;i++){
                graph[i]=new ArrayList<Edge>();
            }
    
            graph[0].add(new Edge(0, 1, 1));
            graph[0].add(new Edge(0, 2, 1));
    
            graph[1].add(new Edge(1, 0, 1));
            graph[1].add(new Edge(1, 3, 1));
    
            graph[2].add(new Edge(2, 0, 1));
            graph[2].add(new Edge(2, 4, 1));
    
            graph[3].add(new Edge(3, 1, 1));
            graph[3].add(new Edge(3, 4, 1));
            graph[3].add(new Edge(3, 5, 1));
    
            graph[4].add(new Edge(4, 2, 1));
            graph[4].add(new Edge(4, 3, 1));
            graph[4].add(new Edge(4, 5, 1));
    
            graph[5].add(new Edge(5, 3, 1));
            graph[5].add(new Edge(5, 4, 1));
            graph[5].add(new Edge(5, 6, 1));
    
            graph[6].add(new Edge(6, 5, 1));

            graph[7].add(new Edge(7, 8, 1));

            graph[8].add(new Edge(8, 7, 1));

            Dfs(graph,7,visit);
            
    }
    
}
