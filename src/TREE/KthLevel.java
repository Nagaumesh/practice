package TREE;
import java.util.*;
import TREE.buildtreePreorder.Node;;
public class KthLevel {
    public static void klevel(Node root,int k,int i){
    if(root==null){
        return ;
    }
    if(i==k){
        System.out.print(root.data+" ");
    }
        klevel(root.left,k,i+1); 
        klevel(root.right,k,i+1);
    
    }
    public static boolean getpath(Node root,int n,ArrayList<Node> path){
        if(root==null){
            return false;
        }

        path.add(root);

        if(root.data==n){
            return true;
        }
        boolean left=getpath(root.left,n,path);
        boolean right=getpath(root.right,n,path);
        if(left||right){
            return true;
        }
        path.remove(path.size()-1);
        return false;
        
    }
    public static void printlist(ArrayList<Node> l){
        for(int i=0; i<l.size();i++){
            System.out.print(l.get(i).data+" ");
        }
    }

    // lca - lowest common ancestor
    public static Node lca(Node root, int n1,int n2){
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();
        getpath(root,n1,path1);
        System.out.print("n1 path: ");printlist(path1);System.out.println();
        getpath(root,n2,path2);
         System.out.print("n2 path: ");printlist(path2);System.out.println();

        int i=0;
        for( ;i<path1.size() && i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        //last equal node=i-1
        Node lca=path1.get(i-1);
        return lca;
    } 
    // lca -2 using recursions
    public static Node lca2(Node root,int n1,int n2){
        // if(root==null){
        //     return null;
        // }
        //  as root is null
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
    // klevel(root,3,1);
    System.out.println(lca(root,2,4).data);
    System.out.println(lca2(root,2,4).data);
    }
}
