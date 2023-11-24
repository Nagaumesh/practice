package Arrays2D;
import java.util.*;
public class spiral {
    public static void spiral(int arr[][]){
        int sr=0,sc=0;
        int er=arr.length-1,ec=arr[0].length-1;
        while(sr<=er && sc<=ec){
        //top
        for(int i=sc;i<=ec;i++){
            System.out.print(arr[sr][i]+" ");
        }
        //right
        for(int i=sr+1;i<=er;i++){
            System.out.print(arr[i][ec]+" ");
        }
        
        //bottom
        for(int i=ec-1;i>=sc;i--){
            if(sr==er){
                break;
            }
            System.out.print(arr[er][i]+" ");
        }
        //left
        for(int i=er-1;i>=sr+1;i--){
            if(sc==ec){
                break;
            }
            System.out.print(arr[i][sc]+" ");
        }
        sr++;
        er--;
        sc++;
        ec--;
        }
       
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int matrix[][]={{1,2,3,4,17},{5,6,7,8,18},{9,10,11,12,19},{13,14,15,16,20}};
        spiral(matrix);
    }
    
}
