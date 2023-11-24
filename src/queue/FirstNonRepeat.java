package queue;

import java.util.*;

public class FirstNonRepeat {

    public static void FirstNonRepeating(String str) {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[(int) ch - (int) 'a']++;

            while (!q.isEmpty()) {
                int peek = (int) q.peek() - (int) 'a';
                if (freq[peek] == 1) {
                    System.out.print(q.peek()+" ");
                    break;
                }
                if (freq[peek] > 1) {
                    q.remove();
                    if (q.isEmpty()) {
                        System.out.print("-1"+" ");
                    }
                }
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str=sc.nextLine();
        String str = "aabccxb";
        FirstNonRepeating(str);
    }

}
