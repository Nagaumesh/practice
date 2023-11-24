package Graphs;

import java.util.*;

//kruskal algo include new way of finding cycle in the graph
public class Kruskal {
    public static class Edge implements Comparable<Edge> {
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }

        @Override
        public int compareTo(Edge e2) {
            return this.wt - e2.wt; // ascending order
        }
    }

    // new method for finding cycles
    static int n = 4;
    static int par[] = new int[n];
    static int rank[] = new int[n];

    public static void init() {
        for (int i = 0; i < par.length; i++) {
            par[i] = i;
        }
    }

    public static int find(int x) {
        if (par[x] == x) {
            return x;
        }
        return par[x] = find(par[x]);
    }

    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);
        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else {
            par[parB] = parA;
        }
    }

    public static void kruskal(ArrayList<Edge> graph, int v) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        for (int i = 0; i < graph.size(); i++) {
            pq.add(graph.get(i));
        }
        // while(!pq.isEmpty()){
        // System.out.println(pq.remove().wt);
        // }
        init();
        int count = 0;
        ArrayList<Edge> ans = new ArrayList<>();
        while (count < v - 1) { // all edges needed for MST(minimum spanning tree)
            Edge e = pq.remove();
            // check wether cycle forms? if formdont include in ans else include in ans
            // having same parent means cycle forms
            if (find(e.src) != find(e.dest)) {
                union(e.src, e.dest);
                ans.add(e);
                count++;
            }

        }
        int total = 0;
        while (!ans.isEmpty()) {
            Edge e = ans.remove(0);
            total = e.wt + total;
            System.out.println("Edge " + "src:" + e.src + " ----> " + "dest:" + e.dest + " wt:" + e.wt);
        }
        System.out.println("total weight: " + total);
    }

    public static void main(String[] args) {
        ArrayList<Edge> graph = new ArrayList<>();
        graph.add(new Edge(0, 2, 15));
        graph.add(new Edge(0, 1, 10));
        graph.add(new Edge(0, 3, 30));
        graph.add(new Edge(1, 3, 40));
        graph.add(new Edge(2, 3, 50));
        // System.out.println(graph.get(0));
        kruskal(graph, 4);

    }
}
