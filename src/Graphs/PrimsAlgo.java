package Graphs;
import java.util.*;
public class PrimsAlgo {
    // prims algo gives the lowest cost which contain every node too
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
        int n;
        int cost;
        pair(int n,int cost){
            this.n=n;
            this.cost=cost;
        }

        @Override
        public int compareTo(pair p2){
            return this.cost-p2.cost;
        }

    }


    public static int prims(ArrayList<Edge> graph[]){
        int v=graph.length;
        boolean visit[]=new boolean[v];
        PriorityQueue<pair> pq=new PriorityQueue<>();
        pq.add(new pair(0,0));
        Queue<pair> q=new LinkedList<>();
        int cost=0;
        while(!pq.isEmpty()){
            pair curr=pq.remove();
            if(visit[curr.n]==false){
                cost=cost+curr.cost;
                q.add(new pair(curr.n,curr.cost));
                visit[curr.n]=true;
                for(int i=0;i<graph[curr.n].size();i++){
                    Edge e=graph[curr.n].get(i);
                    pq.add(new pair(e.dest,e.wt));
                }
            }
        }
        System.out.println("cost:"+cost);
        while(!q.isEmpty()){
            pair curr=q.remove();
            System.out.println(curr.n +"with weight: "+curr.cost);
        }
        return cost;
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[6];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        //        0           
        //      / |  \
        //     /  |   \
        //    1 ---3---2
        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));

        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));

        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));

        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,2,50));
        graph[3].add(new Edge(3,0,30));

        prims(graph);
    }
}
