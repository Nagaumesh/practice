package patterns;

import java.util.*;

public class invertednumpyr {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int num1 = num;
        // for (int j = 1; j <= num1; j++) {
        //     for (int i = 1; i <= num; i++) {
        //         System.out.print(i);
        //     }
        //     num--;
        //     System.out.println();
        // }

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = num;
        int count=1;
        for (int j = 1; j <= num1; j++) {
            for (int i = 1; i <= num; i++) {
                System.out.print(count+" ");count++;
            }
            num--;
            
            System.out.println();
        }


    }
}
