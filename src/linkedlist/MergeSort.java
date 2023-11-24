package linkedlist;
import java.util.*;
public class MergeSort {

    public static class Node {
        int data;
        Node next;

        // constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // every list has one head and tail only hence
    public static Node head; // stores address of head
    public static Node tail;



    public static Node mergesort(Node head) {
        if (head == null || head.next == null) { // 1-element or n element base case
            return head;
        }
        // mid --slow ,fastapproach
        Node mid = getmid(head);           
        // left and right sort
        Node righthead = mid.next;
        mid.next = null;
        Node newleft = mergesort(head);// left
        Node newright = mergesort(righthead);
        // merge
        return merge(newleft, newright);
    }

    private static Node getmid(Node head) {
        if (head == null) {
            return null;
        }
        Node slow, fast;
        slow = head;
        fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static Node merge(Node head1, Node head2) {
        Node mergedll = new Node(-1);
        Node temp = mergedll;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                // temp = head1;
                // temp = temp.next;
                // head1 = head1.next;
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                // temp = head2;
                // temp = temp.next;
                // head2 = head2.next;
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            // temp = head1;
            // temp = temp.next;
            // head1 = head1.next;
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;

        }
        while (head2 != null) {
            // temp = head2;
            // temp = temp.next;
            // head2 = head2.next;
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedll.next;
    }

    public static void printlist(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
         System.out.println();
    }

    public static void main(String[] args) {
        Node head=new Node(4);
        head.next=new Node(3);
        head.next.next=new Node(1);
        printlist(head);
        head=mergesort(head);
        printlist(head);
    }
}
