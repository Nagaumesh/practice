package linkedlist;

import java.util.LinkedList;

public class link {

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

    // adding a node at first position
    public void addfirst(int data) { // no need of static because we use ll.addirst in main
        // step-1 create a node
        Node newNode = new Node(data);
        size++;
        if (head == null) { // no list till now
            head = tail = newNode;
            return;
        }
        // step-2 assign head to next of newnode
        newNode.next = head;
        // step-3 assign new node as head
        head = newNode;
    }

    public void addlast(int data) {
        // step-1 create a node
        Node newNode = new Node(data);
        size++;
        if (head == null) { // no list till now (empty list)
            head = tail = newNode;
            return;
        }
        // step-2 assign tail.next=newnode
        tail.next = newNode;
        // step-3 assign tail=newnode
        tail = newNode;
    }

    public void printlist() {
        if (head == null) {
            System.out.println("no elements in ll");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int index, int data) {
        if (index == 0) {
            addfirst(data);
            return;
        }
        int i = 0;
        size++;
        Node newNode = new Node(data);
        Node temp = head;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        // come until prev and perform operations
        // i=idx-1 temp->prev is stored
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static int size = 0;

    public int size() {
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }

    public void removefirst() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        } else if (head == tail) {
            head = tail = null;
            size--;
            return;
        }
        head = head.next;
        size--;
    }

    public void removelast() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        } else if (head == tail) {
            head = tail = null;
            size--;
            return;
        }
        size--;
        Node temp = head;
        while (((temp.next).next) != null) {
            temp = temp.next;
        }
        // now list is at last but 1
        temp.next = null;
        tail = temp;
        return;
    }

    public int itrsearch(int key) {
        int i = 0;
        Node temp = head;
        while (temp.next != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key, int i) {
        if (head == null) {
            return -1;
        }
        // work
        if (head.data == key) {
            System.out.println("found at index: " + i);
            return i;
        }
        int idx = helper(head.next, key, i + 1);
        // base case
        if (idx == -1) {
            return -1;
        }
        return idx + 1;

    }

    public int recsearch(int key) {
        return helper(head, key, 0);
    }

    public void reverselist() {
        Node prev = null;
        Node curr = tail = head;// assigning from right to left issimilar to curr=head,tail=head
        Node next;
        while (curr != null) {
            next = curr.next;// 1
            curr.next = prev; // 2
            prev = curr;
            curr = next;

        }
        head = prev;

    }

    // deleting nth from last or size-n from starting
    public void removeNth(int n) {
        size = 0;
        size();
        int st = size - n;
        Node temp = head;
        int i = 0;
        while (i < st - 1) {
            temp = temp.next;
            i++;
        }
        Node temp2 = (temp.next).next;
        temp.next = temp2;

    }

    // slow fast approach
    // this helps to find the middle element of the list
    public Node midnode() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;// --tortoise
            fast = fast.next.next;// ---Rabbit
        }
        return slow;
    }

    public boolean palindrome() {
        // basecase
        if (head == null || head.next == null) {
            return true;
        }
        // step-1 find mid
        Node mid = midnode();
        // step-2 reverse the second half
        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;// right half head
        // step-3 compare the first half and second half
        Node left = head; // left half head
        while (right != null) {
            if (right.data != left.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    public boolean isloop() {
        Node slow, fast;
        slow = fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;

            }
        }
        return false;
    }

    public void removeloop() {
        Node slow, fast;
        slow = fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                Node prev = null;
                while (slow != fast) {
                    prev = fast;
                    fast = fast.next;
                    slow = slow.next;
                }
                // slow=fast

                prev.next = null;
            }
        }

    }

    public Node mergesort(Node head) {
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
    
    public void zigzag(){
        //find mid
        Node small=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            small=small.next;
            fast=fast.next.next;
        }
        Node mid =small;

        //rev second half- prev curr next
        Node prev,curr,next;
        prev=null;
        curr=mid.next;
        mid.next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr; 
            curr=next;
        } 
        Node left=head;
        Node right=prev;
        Node nextL,nextR;

        // add the elements to new linked list seperately
        while(left!=null && right!=null){
           nextL=left.next;
           left.next=right;
           nextR=right.next;
           right.next=nextL; 

           left=nextL;
           right=nextR;
        }  
    }
    public static void main(String[] args) {
        link ll = new link();
        // LinkedList<Integer> ll = new LinkedList<>();
        ll.addfirst(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        // 5->4->3->2->1
        ll.printlist();
        ll.zigzag();
        ll.printlist();
  
        // head = ll.mergesort(head);
        // ll.printlist();

        // ll.addfirst(2);
        // ll.addfirst(1);
        // ll.addlast(3);
        // ll.addlast(4);
        // ll.add(2, 3);
        // ll.printlist();
        // ll.size();
        // System.out.println(size);
        // ll.removefirst();
        // ll.printlist();
        // System.out.println(size);
        // ll.removelast();
        // ll.printlist();
        // System.out.println(size );
        // System.out.println( ll.itrsearch(3
        // System.out.println( ll.recsearch(3));
        // ll.reverselist();
        // ll.printlist();
        // ll.removeNth(3);
        // ll.printlist();
        // System.out.println(ll.palindrome()); // changes the list
        // ll.printlist();
        // ll.printlist();

        // head=new Node(1);
        // Node temp=new Node(2);
        // head.next=temp;
        // head.next.next=new Node(3);
        // head.next.next.next=temp;
        // System.out.println(ll.isloop());
        // ll.removeloop();
        // ll.printlist();
        // System.out.println(ll.isloop());

    }

}
