// to solve patterns assume the pattern as matrix and play the game
package patterns;
import java.util.*;
public class inverted_pyr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num =sc.nextInt();
        int space=num-1,symbol=1;
        
        for(int i=1;i<=num;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            space--;
            for(int j=1;j<=symbol;j++){
            System.out.print("*");
            }
            symbol++;
            System.out.println();

            
        }

    }
}
