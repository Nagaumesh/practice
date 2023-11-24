package Graphs;

import java.util.*;

// cycle detection in directed graph
public class CycleDetection {
    public static class Edge {
        int src;// source
        int dest;// destination

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
    public static boolean cycleDetection(ArrayList<Edge> graph[]){
         for(int i=0;i<graph.length;i++){
            if(cycleutil(i,graph)==true){
                return true;
            }
         }
         return false;             
    }
    public static boolean cycleutil(int src,ArrayList<Edge> graph[]){
        int v=graph.length;
        boolean visited[]=new boolean[v];
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()){
            int temp=q.remove();
            visited[temp]=true;
            for(int i=0;i<graph[temp].size();i++){
                int child=graph[temp].get(i).dest;
                if(visited[child]==true){
                    return true; //cycle exist
                }else{
                    q.add(child);
                }
            }
        }
        return false; //cycle dosent exist
    }

    public static void main(String[] args) {
        // 1----> 0 <---3
        //       |     ^
            //   |    /
            //   |   /
            //   \/ /
            //   2

        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,0));

        System.out.println(cycleDetection(graph));// false -no  cycle true- there exist a cycle
    }
}
