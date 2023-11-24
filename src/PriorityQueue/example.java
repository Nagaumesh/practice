package PriorityQueue;
import java.util.*;
public class example {

    public static class student implements Comparable<student>{
        int rank;
        String name;
        student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(student s2){
            // return (int)(this.name.charAt(0))-(int)s2.name.charAt(0); //for names
            return this.rank- s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<student> pq=new PriorityQueue<>();
        pq.add(new student("umesh",1));
        pq.add(new student("qt",2));
        pq.add(new student("bambambole",3));
        while(!pq.isEmpty()){
            System.out.println(pq.remove().name);
        }
        // for reverse order 
        // PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());

    }
}
