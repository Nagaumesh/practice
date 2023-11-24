package strings;
import java.util.*;
public class basics {
    public static void palindrome(String str){
        int j=str.length()-1;
        boolean palindrome=true;
       for(int i=0;i<=str.length()/2;i++){
        if(str.charAt(i)!=str.charAt(j)){
            palindrome=false;
        }
        j--;
       }
       if(palindrome==true){
            System.out.println("given string: "+str+" is palindrome");
       } 
       else{
        System.out.println("given string: "+str+" is not a palindrome"); 
       }
    }
    public static void main(String[] args) {
    //     String lastname="Nagaumesh";
    //     String firstname=new String("kamisetty");
    //     //concatination
    //     String fullname=firstname+" "+lastname;
    //     System.out.println(fullname);

    //                                                          length of string
    // int length=lastname.length();
    // System.out.println(length);


    // palindrome("racecar");

    String s1="tony";
    String s2="tony";
    String s3= new String("tony");

    //here s1 equals to s2 but not s3
    //  here s1 and s2 points to same memory location of tony
    // to check these types of storages we use
    if(s1.equals(s3)){
        System.out.println("s1 and s3 equal");
    }
    if(s1==s3){
        System.out.println("s1 and s3 equal");
    }else{
        System.out.println("s1 and s3 not equal");
    }

                                                        // substring
     String lastname="Nagaumesh";
     System.out.println(lastname.substring(0,4));//--------excluding end index
                                                        //compare to
    s1.compareTo(s2);       -> "+" s1>s2        -> "-" s1<s2       ->"0" s1=s2

    }
    
}
