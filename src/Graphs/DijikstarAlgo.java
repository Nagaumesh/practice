package Graphs;

import java.util.*;

public class DijikstarAlgo {
    // dijikstra is an algo used to find shortest distance
    // from a point to every other point of graph BFS is used here
    // Not applicable for negative weights
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
    public static class pair implements Comparable<pair>{
        int n;//nodenumber
        int dis;//distance
        pair(int n,int dis){
            this.n=n;//node
            this.dis=dis;//distance from src
        }
        @Override
        public  int compareTo(pair p2){
            return this.dis-p2.dis; //path based sort in ascending order
        }
    }
    public static void Dijikstar(ArrayList<Edge> graph[],int src){
        int V=graph.length;
        int dis[]=new int[V];
        for(int i=0;i<V;i++){
            if(i!=src){
                dis[i]=Integer.MAX_VALUE;
            }
        }
        boolean visit[] = new boolean[V];
        PriorityQueue<pair> pq=new PriorityQueue<>();
        pq.add(new pair(src,0)); // distancce from src to src is 0
        while(!pq.isEmpty()){
            pair curr=pq.remove();
            int num=curr.n;
            if(visit[num]==false){
                visit[num]=true;
                for(int i=0;i<graph[num].size();i++){
                    Edge e=graph[num].get(i);
                    int u=e.src;
                    int v=e.dest;
                    int wt=e.wt;
                    if(dis[v]>dis[u]+wt){
                        dis[v]=dis[u]+wt;
                        pq.add(new pair(v,dis[v]));
                    }
                    
                }
            }
        }
        //print
        System.out.println("index:shortest Distance");
        for(int i=0;i<graph.length;i++){
                    System.out.print(i+":"+dis[i]+"  ");
                 }

    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[6];

        //     >1 --->3
        //   /  |    /\ \         **3to 5 and 4 to 5 
        //  0   |     |   5
        //   \  \/    | /
        //     >2---->4

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 5, 5));
        graph[4].add(new Edge(4, 3, 2));

        Dijikstar(graph, 0);
    }
}
