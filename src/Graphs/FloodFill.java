package Graphs;
import java.util.*;
public class FloodFill {
    public  static void flood(int images[][],int sr,int sc,int fill){
      int colour=images[sr][sc];
      boolean visited[][]=new boolean[images.length][images[0].length];
      util(images,colour,visited,sr,sc,fill);

      System.out.println("------------------HEEEEEEEEEE----------------");
      for(int i=0;i<images.length;i++){
        for(int j=0;j<images[i].length;j++){
            System.out.print(images[i][j]+" ");
        }
        System.out.println();
      }
    }
    
    public static void util(int images[][],int colour,boolean visited[][],int sr,int sc,int fill){
        if(sr>=images.length || sr<0 ||sc>=images[0].length ||sc<0 || visited[sr][sc] || images[sr][sc]!=colour){
            return;
        }
        visited[sr][sc]=true;
        if(images[sr][sc]==colour){
            images[sr][sc]=fill;
        }

     //up
      util(images,colour,visited,sr-1,sc,fill);
      //down
      util(images,colour,visited,sr+1,sc,fill);
      //right
      util(images,colour,visited,sr,sc+1,fill);
      //left
      util(images,colour,visited,sr,sc-1,fill);
    }
    public static void main(String[] args) {
        int images[][]={{1,1,1},
                        {1,1,0},
                        {1,0,1}};
        
        flood(images,2,1,2);
    }
}
