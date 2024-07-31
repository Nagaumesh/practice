
package GreedyApproach;

import java.util.*;

public class JobSequencing {

    // every job is done for 1 instance of time
    // 1st element of row is deadline and the second one is the profit made if the
    // job is done before deadline
    public static void main(String[] args) {
        // for second
        int[][] job = { { 2, 20 }, { 1, 30 },{ 2, 40 }, { 1, 10 } };
        Arrays.sort(job, Comparator.comparingInt(i -> i[0]));
        // System.out.println(job.length);

        for(int i=0;i<job.length;i++){
        System.out.println("("+job[i][0]+","+job[i][1]+")");
        }

        // int i = 0;
        // int totalcost = 0;
        // while (i < job.length) {
        //     int curr = job[i][0];
        //     int maxcost = job[i][1];
        //     i++;
        //     while ( i < job.length  && curr == job[i][0]) {
        //         maxcost = Math.max(maxcost, job[i][1]);
        //         i++;
        //     }
        //     totalcost = totalcost + maxcost;

        // }
        // System.out.println("Total cost:" + totalcost);
    }

}
