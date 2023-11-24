package TREE;
import java.util.*;
import TREE.buildtreePreorder.Node;
public class Subtree {

    public static boolean Isidentical(Node root,Node subroot){
        if(root==null&& subroot==null){
            return true;
        }else if(root==null || subroot==null|| root.data!=subroot.data){
            return false;
        }
        if(!Isidentical(root.left,subroot.left)){
            return false;
        }
        if(!Isidentical(root.right,subroot.right)){
            return false;
        }
        return true;
    }

    public static boolean Issubtree(Node root,Node subroot){
        if(root==null){
            return false;
        }
        if(root.data==subroot.data){
            if(Isidentical(root,subroot)){
                return true;
            }
        }
        return Issubtree(root.left, subroot) || Issubtree(root.right,subroot);
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

        //   2
        //  / \
        // 4   5
    Node subroot=new Node(2);
    subroot.left=new Node(4);
    subroot.right=new Node(5); 
    
    System.out.println(Issubtree(root,subroot));
    }
}
