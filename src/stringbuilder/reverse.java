package stringbuilder;
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder sb =new StringBuilder("");
        String str ="dhanyalakka";
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
    
}
