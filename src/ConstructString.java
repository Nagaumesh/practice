// import java.util.ArrayList;
// import java.util.Scanner;

// public class Main {

//     // a-97               z-122

//     public static void main(String[] args) {
//         int c='z';
//         System.out.println(c);
//         int n=2;
//         int d=3;
//         util(n,d,0,'a',"");
//     }
//     public static int count;
//     public static void util(int n, int d, int p, int alpha,String str){
//         if(p<n){
//             util(n, d, p+1, alpha ,str+(char)alpha);
//         }
//         if(p==n){
//             count++;
//             if((alpha+1)-(int)str.charAt(p-1)<=d){
//                 util(n, d, p, alpha+1,str.replace(str.charAt(p-1), (char)alpha));
//             }else if(){

//             }
            
//         }


//     }
// }

import java.util.Scanner;

public class ConstructString {

    public static long help(int n, int d, String s) {
        if (s.length() == n) {
            return 1;
        }
        long sum = help(n, d, s + s.charAt(s.length() - 1));
        for (int i = 1; i <= d; i++) {
            char c = (char) (s.charAt(s.length() - 1) + i);
            if (c > 'z') c -= 26;
            char x = (char) (s.charAt(s.length() - 1) - i);
            if (x < 'a') x += 26;
            sum += help(n, d, s + c);
            sum += help(n, d, s + x);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        long ans = 0;
        for (int i = 0; i < 26; i++) {
            String s = "";
            char c = (char) ('a' + i);
            s += c;
            ans += help(n, d, s);
        }
        System.out.println(ans);
    }
}



