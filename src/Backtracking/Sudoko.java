package Backtracking;
import java.util.Arrays;
public class Sudoko {
    public static void print(int[][] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void main(String[] args) {
        int sudoko[][] = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };
        solve(sudoko);
        print(sudoko);
    }

    public static boolean solve(int [][]sudoko){
        for(int i=0;i<sudoko.length;i++){
            for(int j=0;j<sudoko[i].length;j++){
                if(sudoko[i][j]==0){
                    for(int k=1;k<=9;k++){
                        if(isvalid(sudoko,i,j,k)){
                            sudoko[i][j]=k;

                            if(solve(sudoko)){
                                return true;
                            }else{
                                sudoko[i][j]=0; //backtrack
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean isvalid(int[][] sudoko, int row,int col, int k){
        for(int i=0;i<sudoko.length;i++){
            //row
            if(sudoko[i][col]==k) return false;
            //col
            if(sudoko[row][i]==k) return false;
            //3*3
            if(sudoko[3*(row/3)+i/3][3*(col/3)+i%3]==k) return false;
        }
        return true;
    }
}
