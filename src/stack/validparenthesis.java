package stack;
import java.util.*;
public class validparenthesis {

    public static boolean paracheck(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==']' || str.charAt(i)=='}' || str.charAt(i)==')'){

                if(s.isEmpty()){
                    return false;
                }
                if( s.peek()=='{' && str.charAt(i)=='}' ||
                s.peek()=='[' && str.charAt(i)==']' ||
                s.peek()=='(' && str.charAt(i)==')'){
                        return true;
                }else{
                    return false;
                }
              
                
            }else{
                s.push(str.charAt(i));
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
        
    }
    public static boolean duplicate(String str){
        Stack<Character> s=new Stack<Character>();
        boolean mid=false;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==')'){
                int count=0;
                while(!(s.peek()=='(')){
                    s.pop();
                    count++;
                }
                s.pop();
            if(count<1){
                return false;
            }
            }else{
                s.push(ch);
            }
        //     if(ch=='('){
        //         s.push(ch);
        //     }
        //     if(ch==')' && mid==true){
        //         if(s.isEmpty()){
        //             return false;
        //         }
        //         s.pop();
        //         mid=false;
        //     }
        //     if((mid==false && ch==')')){
        //         return false;
        //     }
        //     if(!(ch=='(' || ch==')')){
        //         mid=true;
        //     }
        // }
        // if(s.isEmpty()){
        //     return true;
        // }else{
        //     return false;
        }
        return true;
       

    }
    public static void main(String[] args) {
        String str="";
        // System.out.println( paracheck(str));
        System.out.println(duplicate(str));
       
        
        
    }
    
}
 