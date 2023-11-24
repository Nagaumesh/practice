package recursion;
import java.util.*;


public class duplicate {

    public static void unique(String str,int i,boolean memory[],StringBuilder sb){
    if(i== str.length()){
        System.out.println(sb);
        return;
    }
    int temp=(int)(str.charAt(i))-(int)('a');
    if(memory[temp]!=true){
        sb.append(str.charAt(i));
        memory[temp]=true;
    }
    i++;
    unique(str,i,memory,sb);

}
    public static void main(String[] args) {
        boolean memory[]=new boolean [26]; // as there are 26 alphabets 
        StringBuilder sb =new StringBuilder("");
       unique("apnacollege",0,memory,sb);
    
    
    }

}
