package Sets_hashmaps;
import java.util.*;
public class basics {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        // sets are similar to real sets in mathematics 
        // 1.they can only store one thing (same is not allowed- no duplicates)
        // 2.null value is accepted
        // 3. similar to hashmaps these are also unordered(ouput is not in the same ordere as u entered)
        hs.add(1);
        hs.add(12);
        hs.add(3);
        hs.add(1);
        hs.add(3);
        // hs.remove(2);
        // System.out.println(hs);
        // System.out.println(hs.contains(3));
        // System.out.println( "size of the set"+hs.size() );  

        // iteration in sets
        // Iterator i= hs.iterator();
        // while(i.hasNext()){
        //     System.out.println(i.next()); 
        // }
        // 2nd stepusing for each loop
        for(int it: hs){
            System.out.println(it);
        }

    }
}
