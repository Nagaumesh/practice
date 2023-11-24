package Sets_hashmaps;
import java.util.*;
public class Iteration {
    public static String getstart(HashMap<String,String> tickets){
        HashSet<String> initial=new HashSet<>();
        for(String key: tickets.keySet()){
            initial.add(tickets.get(key));
        }
        for(String key: tickets.keySet()){
            if(!initial.contains(key)){
                return key; 
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String ,String> tickets=new HashMap<>();
        tickets.put("chennai","banglore");
        tickets.put("mumbai","Delhi");
        tickets.put("Goa","chennai");
        tickets.put("Delhi","Goa");
        String start=getstart(tickets);
        // System.out.print(start);
        for(int i=0;i<tickets.keySet().size();i++){
            System.out.print(start+" ---> ");
            start=tickets.get(start);
        }
    }
}
