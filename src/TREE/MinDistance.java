package TREE;
import TREE.buildtreePreorder.Node;
import java.util.*;
public class MinDistance {
    public static Node lca2(Node root,int n1,int n2){
     
        if(root.data==n1 ||root.data==n2||root==null){
            return root;
        }
        Node leftlca=lca2(root.left,n1,n2);
        Node rightlca=lca2(root.right,n1,n2);
        // there will be 3 cases lca in left /right /itself
        //1 -leftside lca 
        if(rightlca==null){
            return leftlca;
        }
        //2-right side lca
        if(leftlca==null){
            return rightlca;
        }
        // 1 left and 1 right
        return root;
        
    }
    public static int distance(Node root,int n1){
        if(root==null){
            return -1;
        }
        if(root.data==n1){
            return 0;
        }
        int leftdis=distance(root.left,n1); 
        int rightdis=distance(root.right,n1);
        if(leftdis==-1 && rightdis==-1){
            return -1;
        }else if(leftdis==-1){
            return rightdis+1;
        }else{
            return leftdis+1;
        }

    }

    public static int Mindistance(Node root,int n1,int n2){
        Node lca=lca2(root,n1,n2);
        int d1=distance(lca,n1);
        int d2=distance(lca,n2);
        return d1+d2;

    }

    //Kth ancestor
    public static int KthAnces(Node root,int n,int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int left=KthAnces(root.left, n,k);
        int right=KthAnces(root.right, n,k);
        if(left==-1 && right==-1){
            return -1;
        }
        int max=Math.max(left,right);
        if(max+1==k){
            System.out.print(root.data+" ");
        }
        return max+1;
        // ig wrong

    }

    public static int SumTree(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=SumTree(root.left);
        int rightsum=SumTree(root.right);

        int data=root.data;
        int newleft= root.left== null? 0:root.left.data;
        int newright= root.right== null? 0:root.right.data;
        root.data=leftsum+rightsum+newleft+newright;
        return data;
    }
    public static void preorder(Node root){
        //root left right
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
    //       1
    //      / \
    //     2   3
    //    / \ / \
    //    4 5 6  7   
    Node root=new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.left=new Node(6);
    root.right.right=new Node(7);
    // System.out.println(Mindistance(root, 2, 3));
    // System.out.println(KthAnces(root,8,1 ));
    // preorder(root);
    SumTree(root);
    preorder(root);

    }
     
}
