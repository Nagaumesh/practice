package PriorityQueue;

import java.util.*;

public class Slidingwindow {

    public static class num implements Comparable<num> {
        int idx;
        int data;

        num(int data, int idx) {
            this.data = data;
            this.idx = idx;
        }

        @Override
        public int compareTo(num n2) {
            return n2.data-this.data; //why? -clear this concept again
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k=3; //sliding window size
        int n=arr.length;
        int ans[]=new int[n-k+1]; // length of ans 
        PriorityQueue <num> pq=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(new num(arr[i],i));
        }
        ans[0]=pq.peek().data;
        for(int i=k,j=1;i<n;i++,j++){
            pq.add(new num(arr[i],i));
            while(pq.peek().idx<j){
                pq.remove();
            }
            ans[j]=pq.peek().data;
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }

}
