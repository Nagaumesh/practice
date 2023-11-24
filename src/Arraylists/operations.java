package Arraylists;
import java.util.*;


public class operations {
    public static void swap(ArrayList<Integer> list,int i,int j){
        int  temp =list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);

}
public static int maximum(ArrayList<Integer> list){
 //maximum element
        int max=Integer.MIN_VALUE;
    for(int i=0;i<list.size();i++){
        max=Math.max(max,list.get(i));
    }
    System.out.println("maximum value in list: "+max);
  return max;
}
public static void reverse(ArrayList<Integer> list){
     System.out.print("reversed list: ");
        for(int i =(list.size())-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

}
// 2 pointer approach o{n}
public static int twopoint(ArrayList<Integer>height){
    int sp=0; //starting pointer
    int ep=height.size()-1; //ending pointer
    while(sp<ep){
        int ht=Math.min(height.get(sp),height.get(ep));
        int width=ep-sp;
        int water=ht*width;
        int maxwater=Integer.MAX_VALUE;
        maxwater=Math.max(maxwater,water);
        //updating ptrs
        if(height.get(sp)<height.get(ep)){
            sp++;
        }else 
            ep--  ;
        }
    }
}
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Array list: "+list);
        swap(list, 1, 3);
        System.out.println("Array list: "+list);


    }

}
