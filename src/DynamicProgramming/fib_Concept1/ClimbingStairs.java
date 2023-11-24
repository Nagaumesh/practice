package DynamicProgramming.fib_Concept1;

import java.util.*;

public class ClimbingStairs {

    public static int outcomes(int n) {
        util(n, 0);
        return count;
    }

    public static int count;

    public static void util(int n, int curr) {
        if (curr > n) {
            return;
        }
        if (curr == n) {
            count++;
            return;
        }
        util(n, curr + 1);
        util(n, curr + 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the no of steps: ");
        int n = 5;
        // System.out.println("No of ways: "+outcomes(n));
        System.out.println("No of ways: " + countTable(0));
    }

    // new way of thinking!!!!!!!!!!
    /*
     * it can we written similar to fib as for getting ways of 5 it is
     * (ways of 3 + ways of 4) HOW?
     * from 3 if we add 2 it is 5 for every step
     * from 4 if we add 1 for every step it is 5
     * intresting part is they are unique and complete.
     */
    public static int countways(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return countways(n - 1) + countways(n - 2);
    }

    public static int countTable(int n) { // Tabulation
        if (n == 0) {
            return 0;
        }
        if (n == 1) {

            return 1;
        }
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
