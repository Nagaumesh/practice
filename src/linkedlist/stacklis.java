package linkedlist;

import java.util.*;

public class stacklis {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static class stacklist {
        //push-addfirst it is stored downwards in stack
        public void push(int data){
            Node newnode=new Node(data);
            if(head==null){
                head=tail=newnode;
                return ;
            }
            newnode.next=head;
            head=newnode;
        }
        //pop
        public int pop(){
            if(head==null){
                System.out.println("no element to pop");
                return -1;
            }
            int top=head.data;
            head=head.next; 
            return top; 
        }
        //is empty
        public boolean isempty(){
            if(head==null){
                return true;
            }else{
                return false;
            }
        }
        //peak
        public int peak(){
             if(head==null){
                System.out.println("no element to pop");
                return -1;
            }
            return head.data;
           
        }

    }
    public static void main(String[] args) {
        stacklist s= new stacklist();
         s.push(1) ;
         s.push(2);
         s.push(3);
         while(!s.isempty()){
            System.out.println(s.pop());
        }
    }

}
