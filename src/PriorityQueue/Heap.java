package PriorityQueue;
import java.util.*;
public class Heap {

    public static class heap{
         ArrayList<Integer> arr= new ArrayList<>();

        public void add(int data){
            arr.add(data);

            //child index
            int ci=arr.size()-1;
            int pi=(ci-1)/2;
            
            // min heap at the top minimum elements will be present
            while(arr.get(ci)<arr.get(pi)){
                //swap child and parent
                int temp=arr.get(ci);//child
                arr.set(ci,arr.get(pi));
                arr.set(pi,temp);
                ci=pi;
                pi=(ci-1)/2;
            }
        }
        public int peek(){
            return arr.get(0); // heap is a queue first in first out
        }

        private void heapify(int i){
            // talking about indexes
            int left=(2*i)+1/2;
            int right=(2*i)+2/2;
            int min=i;

            if(left<=arr.size()-1 && arr.get(min)>arr.get(left) ){
                min=left;
            }
            if(right<=arr.size()-1 && arr.get(min)>arr.get(right) ){
                min=right;
            }
            if(min!=i){
                // swap min and i
                int temp=arr.get(i);
                arr.set(i,arr.get(min));
                arr.set(min,temp);

                heapify(min);
            }
        }

        public int remove(){
            int data=arr.get(0);
            // swap the first and last element
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,data); //optional
            arr.remove(arr.size()-1);
            //heapify- process to remove the element and arrange the tree again to min heap
            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String[] args) {
        heap h =new heap();
        h.add(1);
        h.add(5);
        h.add(2);
        // h.remove();
        System.out.println(h.arr);
        // while(!h.isEmpty()){
        // System.out.println(h.remove());
        // }
        
    }
}
