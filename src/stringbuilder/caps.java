package stringbuilder;
import java.util.*;
public class caps {
    public static void main(String[] args) {
        String str="hi, i am umesh";
        StringBuilder sb =new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '){
                i++;
                sb.append(" "+Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
