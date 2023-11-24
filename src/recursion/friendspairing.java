package recursion;
import java.util.*;
public class friendspairing {

    public static int pairing(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }

        //single
        int single= pairing(n-1);
        //pair
        int pair=pairing(n-2);
        int waysofpairing = (n-1)*(pair);

        return single+waysofpairing;
    }
    public static void main(String[] args) {
        System.out.println(pairing(3));
    }
}
