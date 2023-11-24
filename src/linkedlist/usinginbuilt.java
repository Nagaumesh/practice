package linkedlist;

import java.util.*;
import linkedlist.link.Node;

public class usinginbuilt {
    public Node mergesort(Node head) {
        if (head == null || head.next == null) { // 1-element or n element base case
            return head;
        }
        // mid --slow ,fastapproach
        Node mid = getmid(head);
        // left and right sort
        Node newleft = mergesort(head);// left
        Node newright = mergesort(mid.next);
        mid.next = null;
        // merge
        return merge(newleft, newright);
    }

    private Node getmid(Node head) {
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

    private Node merge(Node head1, Node head2) {
        Node mergedll = new Node(-1);
        Node temp = mergedll;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp = head1;
                temp = temp.next;
                head1 = head1.next;
            } else {
                temp = head2;
                temp = temp.next;
                head2 = head2.next;
            }
        }
        while (head1 != null) {
            temp = head1;
            temp = temp.next;
            head1 = head1.next;

        }
        while (head2 != null) {
            temp = head2;
            temp = temp.next;
            head2 = head2.next;
        }
        return mergedll;
    }
    public static Node head;
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(5);
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        head=usinginbuilt.mergesort(head);    
    }
}
