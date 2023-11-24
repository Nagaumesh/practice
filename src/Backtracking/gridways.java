package Backtracking;

public class gridways {

    public static int ways(int i, int j, int n, int m){
    //base case
    if(i==n || j==m){ //end condition
    return 0;
    }else if(i==n-1 && j==n-1){ //why?
        return 1; 
    }

    //recursion
    int w1=ways(i,j+1,n,m);//moving right
    int w2=ways(i+1,j,n,m);//movingdown
    return w1+w2;
    }
    public static void main(String[] args) {
        int n=2,m=2;
        // int grid[][]=new int[n][m];
        System.out.println("no of ways : "+ways(0,0,n,m));
        // this problem can be solved using permutations
        //there will be n-1 D and m-1 R to reach destination
    }
    
}
