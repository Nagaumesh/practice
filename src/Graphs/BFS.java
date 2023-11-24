package Graphs;

import java.util.*;

public class BFS {
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
    public static void BreadthFirstSearch(ArrayList<Edge>graph[]){
        int v=graph.length;
        Queue<Integer> q=new LinkedList<>();
        boolean visited[] =new boolean[v];
        for(int i=0;i<visited.length;i++){
            visited[i] =false;
        }
        q.add(0);// source
        while(!q.isEmpty()){
            int temp=q.remove();
           if(visited[temp]==false){
             visited[temp]=true;
             for(int i=0;i<graph[temp].size();i++){
                Edge e= graph[temp].get(i);
                q.add(e.dest);
             }
             System.out.print(temp+" ");
           }
        }
    }
    public static void DepthFirstSearch(ArrayList<Edge> graph[],int src,boolean visit[]){
      
      if(visit[src]==false){
        visit[src]=true;
        System.out.print(src+ " ");
      }else{
        return;
      }

      for(int i=0;i<graph[src].size();i++){
        int temp=graph[src].get(i).dest;
        DepthFirstSearch(graph, temp,visit);
      }
       
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

        // BreadthFirstSearch(graph);
        
      int v=graph.length;
      boolean visit[]=new boolean[v];
      DepthFirstSearch(graph,0,visit);
    }
}
