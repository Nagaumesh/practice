package GreedyApproach;

import java.util.*;

public class Chocola {
    // min cost to cut a board into to squares
    public static void printarray(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Integer hor[] = { 4, 1, 2 };
        Integer ver[] = { 2, 1, 3, 1, 4 };
        Arrays.sort(hor,Collections.reverseOrder());
        Arrays.sort(ver,Collections.reverseOrder());
        // System.out.println(hor);
        int i = 0;// hor index
        int j = 0;// ver index
        int hp = 1;// horizontal pieces
        int vp = 1;// verticalpieces
        int cost = 0;
        while (i < hor.length && j < ver.length) {
            if (hor[i] >= ver[j]) {
                cost = cost + vp * hor[i];
                hp++;
                i++;
            } else {
                cost = cost + hp * ver[j];
                vp++;
                j++;
            }
        }
        while (i < hor.length) {
            cost = cost + vp * hor[i];
            hp++;
            i++;
        }
        while (j < ver.length ) {
            cost = cost + hp * ver[j];
            vp++;
            j++;
        }

        System.out.println("totalcost: " + cost);

    }

}
