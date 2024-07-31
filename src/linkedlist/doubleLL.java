package linkedlist;

public class doubleLL {
    
    public class Node{
        int data;
        Node prev,next;
        
        public  Node(int data){
            this.data=data;
            prev=next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // add first
    public void addfirst(int data){
        Node newnode= new Node(data);
        size++;
        if(head==null){
           head=tail=newnode;
           return;
        }
        head.prev=newnode;
        newnode.next=head;
        head=newnode;
        
    }
    //print
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    //remove first
    public void removefirst(){
        size--;
        if(head==null){
           System.out.println("empty list ntg to remove");
           return;
        }
        head=head.next;
        head.prev=null;

    }
    public void reverse(){
        Node prev,curr,next;
        prev=null;
        curr=head;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        doubleLL ll =new doubleLL();
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.print();
        ll.reverse();
        ll.print();
        System.out.println("size: "+size);
        Scanner sc= new Scanner(System.in);
    }
    
}
