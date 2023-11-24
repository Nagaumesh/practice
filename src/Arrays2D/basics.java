package Arrays2D;
import java.util.*;
public class basics {

    public static void input(int matrix[][]){
        Scanner sc= new Scanner(System.in);
        int n=matrix.length;  //rows
        int m=matrix[0].length; // coloumns
        System.out.print("input the array");
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               matrix[i][j]=sc.nextInt();
            }
        }
    }

    public static void print(int matrix[][]){
        int n=matrix.length;  //rows
        int m=matrix[0].length; // coloumns
        System.out.println("the array is:");
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               if(key==matrix[i][j]){
                System.out.println("the key: "+key+" is found at position: "+"("+i+","+j+")");
               }
            }
           
        }
    }
             
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //creating a new 2d array
        // int matrix[][]= new int [3][3];
        // int n=matrix.length;  //rows
        // int m=matrix[0].length; // coloumns
        // input(matrix);
       int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        print(matrix);
        // search(matrix,4);

    }

       
}
