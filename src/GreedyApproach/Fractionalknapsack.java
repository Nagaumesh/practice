package GreedyApproach;

import java.util.*;

public class Fractionalknapsack {

    public static void main(String[] args) {
        int weight[] = { 1,2,3,4,5};
        int value[] = { 10,100,50,100,100};
        Double ratio;
        Double capacity=7.00;
        Double bagcost=0.00;
        Double items[][] = new Double[weight.length][3];
        for (int i = 0; i < weight.length; i++) {
            items[i][0] = (double) value[i];
            items[i][1] = (double) weight[i];
            ratio = value[i] / (double)weight[i];
            items[i][2] = ratio;
        }
        Arrays.sort(items, Comparator.comparingDouble(o -> o[2]));
          
        System.out.println("value  weight  ratio");
        for (int i = 0; i < weight.length; i++) {
            System.out.println(items[i][0] + "  " + items[i][1] + "   " + items[i][2]);
        }

        for(int i=weight.length-1;i>=0;i--){
            if(items[i][1]<=capacity){
                capacity=capacity-items[i][1];
                bagcost=bagcost+items[i][0];
            }else{
                bagcost=bagcost+capacity*items[i][2];
                capacity=0.0;
                break;
            }
        }
        System.out.println("max capacity of bag: "+capacity+"\nvalue of bag: "+bagcost);
 
    }

}
