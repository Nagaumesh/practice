package Graphs;
import java.util.*;
public class HasPath {
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
    public static boolean ans;
    public static boolean hasPath(ArrayList<Edge> graph[],int src,int det){
        if(src==det){
            return true;
        }
        boolean visit[]=new boolean[graph.length];
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()){
            int temp=q.remove();
            visit[src]=true;
            for(int i=0;i<graph[temp].size();i++){
               Edge e=graph[temp].get(i);
               if(visit[e.dest]==false){
                if(e.dest ==det){
                    return true;
                }
                q.add(e.dest);
                visit[e.dest]=true;
               }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // int v = 7;
                  
            //     1 ---3
            //   /      |  \
            //  0       |   5--6
            //   \      | /
            //    2-----4


            ArrayList<Edge> graph[] = new ArrayList[7];

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
            System.out.println(hasPath(graph, 0, 6));
    
    }
}
