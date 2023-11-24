package Graphs;
import java.util.*;

import Graphs.DijikstarAlgo.pair;
public class BellmanFord {
// bellman ford is similar to dijikstra but can be used for negative weights also
// it has a bit more time complexity than the dijikstra
    public static class Edge {
        int src;// source
        int dest;// destination
        int wt;

        Edge(int src, int dest,int wt) {
            this.src = src;
            this.dest = dest;
            this.wt=wt;
        }
    }

    public static void Bellman(ArrayList<Edge> graph[],int src){
        int v=graph.length;
        int dis[]=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            dis[i]=Integer.MAX_VALUE;
        }
        dis[src]=0;
    for(int k=0;k<v-1;k++){
        for(int i=0;i<v;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e=graph[i].get(j);
                int u=e.src;
                int V=e.dest;
                int wt=e.wt;
                if(dis[u]==Integer.MAX_VALUE){
                    continue;
                }
                if(dis[V]>dis[u]+wt){
                    dis[V]=dis[u]+wt;
                }
            }
        }
    }
    System.out.println("index:shortest Distance");
    for(int i=0;i<graph.length;i++){
        if(dis[i]==Integer.MAX_VALUE){
            dis[i]=-1;
        }
        System.out.print(i+":"+dis[i]+"  ");
    }

    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[]=new ArrayList[6];
        boolean visit[]=new boolean [graph.length];
 
             //     >1 --->3
             //   /  |    /\ \   3to 5 and 4 to 5 
             //  0   |     |   5
             //   \  \/    | /
             //     >2---->4
         
             for(int i=0;i<graph.length;i++){
                 graph[i]=new ArrayList<Edge>();
             }
     
             graph[0].add(new Edge(0, 1, 2));
             graph[0].add(new Edge(0, 2, 4));
     
             graph[1].add(new Edge(1, 2, 1));
             graph[1].add(new Edge(1, 3, 7));
     
             graph[2].add(new Edge(2, 4, 3));
    
             graph[3].add(new Edge(3, 5, 1));
     
             graph[4].add(new Edge(4, 5, 5));
             graph[4].add(new Edge(4, 3, 2));

             
             Bellman(graph, 1);
             
    }
}
