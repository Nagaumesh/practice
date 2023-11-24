package Arraylists;
import java.util.*;
public class storewater {

    public static int watercapacity(ArrayList<Integer>height){
    int water,length,width,maxwater=Integer.MIN_VALUE;
    for(int i=0;i<height.size();i++){    
        for(int j=i+1;j<height.size();j++){
            width=j-1;
            length=Math.min(height.get(i),height.get(j));
            water=length*width;
            maxwater=Math.max(maxwater,water);
        }
    } 
    return maxwater;
    }

    public static void main(String[] args) {
        ArrayList<Integer>height=new ArrayList<>();
        //     1, 8, 6, 2, 5, 4, 8, 3, 7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(watercapacity(height));

    }
    
}
