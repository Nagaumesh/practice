package deque;
import java.util.*;
public class inbuilt{

    public static void main(String[] args) {
        Deque<Integer> d=new LinkedList<>();
        for(int i=1;i<=5;i++){
            d.addFirst(i);
        }
         d.removeLast();
        System.out.println(d);
    }
}