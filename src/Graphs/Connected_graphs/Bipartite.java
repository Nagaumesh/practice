package Graphs.Connected_graphs;
import java.util.*;

// bipartite graph meaning
// A bipartite graph is one whose vertices, V, can be divided into two independent sets, V1 and V2.
//and every edge of the graph connects one vertex in V1 to one vertex in V2 ----important
// generally solved by colouring so that we can understand if it canbe divided into two independent or not
public class Bipartite {
    public static class Edge {
        int src;// source
        int dest;// destination

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
    public static boolean isBipartite(ArrayList<Edge> graph[],int src){
        int v=graph.length;
        Queue<Integer> q=new LinkedList<>();
        int colour[]=new int[v];
        for(int i=0;i<colour.length;i++){
            colour[i]=-1;
        }
        q.add(src);
        colour[src]=0; //let there are 2 colours 0 and 1, -1 is colour not yet assigned
        //using breadth first search
        while(!q.isEmpty()){
          int temp=q.remove();
          int pc=colour[temp]; //pc-parent colour
          for(int i=0;i<graph[temp].size();i++){
            //  case-1: children has no colour parent has colour
            int child=graph[temp].get(i).dest;
            int cc=colour[child];//child colour
            if(cc==-1){
                q.add(child);
            }
            if(cc==-1 && pc==0){
                colour[child]=1;
            }else if(cc==-1 && pc==1){
                colour[child]=0;
            }
            //case-2: child colour= parent colour
            if(cc==pc){
                return false;
            }
            //case-3: child colour !=parent colour
            if(cc!=pc){
                continue;
            }
          }
        }
        return true;
       
    }
    public static void main(String[] args) {
        //       0
        //     / |       
        //   1   |
        //     \ |
        //       2
        // int arr[]=new int[5]; ArrayList<Integer> a=new ArrayList<>();
        int  v=3;
        ArrayList<Edge> graph[]=new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2)); 

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,0)); 
        graph[2].add(new Edge(2,1));

        System.out.println(isBipartite(graph, 0));
    }
}
