package Backtracking;
import java.util.*;

public static int row(int  arr[][],int row,int col,int val){
 
}

public static void fillsudoko(int arr[][],int row,int col,int val){
    row(arr[][],row,col,val);
}

public class Sudoko {
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
        int row=0;
        int  coloumn=0;
        fillsudoko(sudoko,row,coloumn,1);
    }
}
