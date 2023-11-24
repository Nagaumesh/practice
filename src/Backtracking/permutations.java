package Backtracking;

public class permutations {

    public static void printpermutations(String str,String ans){
        //base codition
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0;i<str.length();i++){
            char curr =str.charAt(i);
            // ans=ans+str.charAt(i);   
            // here ans should not be updated should just pass because the value changes in every recursion so never assign values while recursions
            String newstr=str.substring(0, i)+str.substring(i+1);
            printpermutations(newstr, ans+curr);
        }
    }
    public static void main(String[] args) {
        //permutations is if you give a string abc ans are acb abc bac bca....
        printpermutations("abc", "");
    }
    
}
