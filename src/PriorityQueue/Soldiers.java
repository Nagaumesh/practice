package PriorityQueue;

import java.util.*;

// a thing to remember in the compareTo function

public class Soldiers {
    public static class weaksoldier implements Comparable<weaksoldier> {
        int count; // no of soldiers
        int idx; // index of the line

        weaksoldier(int count, int idx) {
            this.count = count;
            this.idx = idx;
        }

        @Override
        public int compareTo(weaksoldier w2) {
            if (this.count == w2.count) {
                return idx;
            } else {
                return this.count - w2.count;
            }

        }

    }

    public static void main(String[] args) {
        PriorityQueue<weaksoldier> pq = new PriorityQueue<>();
        int army[][] = { { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 0, 0, 0, 0 } };

        for (int i = 0; i < army.length; i++) {
            int count = 0;
            for (int j = 0; j < army[0].length; j++) {
                if (army[i][j] == 1) {
                    count++;
                }
            }
            pq.add(new weaksoldier(count, i));
        }
        int k=2;
        for(int i=0;i<k;i++){
            System.out.println("index:"+pq.remove().idx);
        }
       

    }

}
