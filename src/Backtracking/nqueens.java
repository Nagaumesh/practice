package Backtracking;
import java.util.*;
public class nqueens {

    public static void setqueens(char board[][],int i){
        // base case
        if(i==board.length){
            System.out.println("----------chessboard---------");
            printboard(board);
            count++;
            return;
        }
        //work
            for(int j=0;j<board[0].length;j++){
                if(issafe(board,i,j)==true){
                    board[i][j]='Q';
                    setqueens(board, i+1);
                    board[i][j]='X';
                }
            }
    }
    public static boolean issafe(char board[][],int i,int j){
        //verticalup
        for(int ii=i-1;ii>=0;ii--){
                if(board[ii][j]=='Q'){
                    return false;
                }
        }
        //leftdiagnol
        for(int ii=i-1,jj=j-1;ii>=0 && jj>=0;ii--,jj--){
                if(board[ii][jj]=='Q'){
                    return false;
                }
        }
        //right diagnol
        for(int ii=i-1,jj=j+1;ii>=0 && jj<board[0].length;ii--,jj++){
            if(board[ii][jj]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void printboard(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                    System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

    }
    static int count=0; // new thing learnt
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the n of n*n matrix:");
        int n=sc.nextInt();
        char board[][]=new char [n][n];
        //intializing chessboard
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                    board[i][j]='X';
            }
        }
        setqueens(board,0);
        System.out.println("No of possible solutions are:"+count);
    }
}
