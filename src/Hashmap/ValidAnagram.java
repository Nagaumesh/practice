package Hashmap;

import java.util.*;

public class ValidAnagram {
    public static boolean isvalid(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            // if (hm.containsKey(s.charAt(i))) {
            //     hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            // } else {
            //     hm.put(s.charAt(i), 1);
            // }
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i), 0)+1);
        }
        for (int i = 0; i < t.length(); i++) {
            if (!hm.containsKey(t.charAt(i))) {
                return false;
            } else {
                int value = hm.get(t.charAt(i));
                hm.put(t.charAt(i), value - 1);
                if(value==1){
                    hm.remove(t.charAt(i));
                }
            }
        }
      
        if (hm.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "eafrtfh";
        String t = "hefartf";
        System.out.println(isvalid(s, t));

    }
}
