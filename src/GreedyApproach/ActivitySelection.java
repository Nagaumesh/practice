package GreedyApproach;
import java.util.*;
public class ActivitySelection {
    
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        // if end aarray is sorted
        ArrayList<Integer> index=new ArrayList<>();
        int finished=end[0]; //ans.add(activities[0][2])
        index.add(0);// ans.add(activities[0][0])
        for(int i=1;i<end.length;i++){
            if(start[i]>=finished){
                index.add(i);// ans.add(activities[i][0])
                finished=end[i]; //ans.add(activities[i][2])
            }
        }
        System.out.println("count: "+index.size());
        for(int i=0;i<index.size();i++){
            System.out.println("A"+index.get(i)+" ");
        }
        //if not sorted
        // int activities[][]=new int[start.length][3];
        // for(int i=0;i<start.length;i++){
        //     activities[i][0]=i;
        //     activities[i][1]=start[i];
        //     activities[i][2]=end[i];
        // }
        // //using lamda function
        // Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
        
    }  
}
