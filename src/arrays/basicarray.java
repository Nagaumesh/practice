package arrays;
import java.util.*;
public class basicarray {   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        // creation of array 
        String friends[] = new String[10];

        //input of an array
        friends[0]=sc.nextLine();

        // array length
        int arrlen=friends.length;
        System.out.println(arrlen);
    }
}

