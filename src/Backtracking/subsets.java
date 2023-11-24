package Backtracking;

public class subsets {

    public static void printsubsets(String str,int i,String ans){
        //base case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //work
        //yes i wanna be a part of subset
        // ans=ans+str.charAt(i);i++;
        printsubsets(str, i+1,ans+str.charAt(i));//why is above steps not working
        //no i dont wanna be a part of subset
        // i++;
        printsubsets(str,i+1,ans);
    }
    public static void main(String[] args) {
        printsubsets("abc",0,"");
        // String str="umesh";
        // System.out.println(str.charAt(0));
    }
}
