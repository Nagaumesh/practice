package queue;
import java.util.*;
public class usingLL {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static Node head;
    public static Node tail;
    
    //add
    public static void add(int data){
        Node newnode =new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }else{
            tail.next=newnode;
            tail=newnode;
        }

    }
    
    //remove
    public static int remove(){
        if(head==null){
            System.out.println("No elements to remove");
            return -1;
        }else{
            //single element
            int front=head.data;
            head=head.next;
            return front;
        }
    }

    //peek
    public static int peek(){
           if(isEmpty()){
            return -1;
           }
           return head.data;
    }

    public static boolean isEmpty(){
        return head==null;
    }
    
    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);
        while(!isEmpty()){
            System.out.println(peek());
            remove();
        }
         
    }
}
