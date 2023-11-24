package recursion;

public class tilingproblem {


    public static  int tiling(int n){ // let we have 2*n floor and 2*1 tiles
    if(n==0 || n==1){
        return 1;    //  assigning no tiles for 0 is also a way
    }
    //horizontal
    int hor=tiling(n-2);
    //vertical
    int ver=tiling(n-1);
    return hor+ver;//total
    }
    
    public static void main(String[] args) {
        System.out.println(tiling(4));
    }
    
}
