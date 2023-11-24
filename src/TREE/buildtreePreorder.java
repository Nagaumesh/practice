package TREE;

import java.lang.reflect.Constructor;
import java.util.*;

public class buildtreePreorder {
    public static class Node {
        public static final String is = null;
        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // As this is preorder-PRE(node left right)
    public static class Binarytree {
        static int idx = -1;

        public Node ConstructTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = ConstructTree(nodes);
            newnode.right = ConstructTree(nodes);
            return newnode;
        }

        public void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public void postorder(Node root) { // left right node
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        public void inorder(Node root) {// left root right
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        // preorder ,postorder, inorder(recursion) uses dfs depthfirst search
        public static Queue<Node> q = new LinkedList<>();

        public void levelorder(Node root) {
            if(root==null){
                return;
            }
            q.add(root);
            q.add(null);
            while (true) {
                Node currnode = q.remove();
                if (currnode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    }else {
                        q.add(null);
                    }
                }else{
                    System.out.print(currnode.data+" ");
                    if(currnode.left!=null){
                        q.add(currnode.left);
                    }
                    if(currnode.right!=null){
                        q.add(currnode.right);
                    }
                }
            }
        }

        public int height(Node root){
            if(root==null){
                return 0;
            }
            int lh=height(root.left);
            int rh=height(root.right);
            int maxheight=Math.max(lh,rh)+1 ;
            return maxheight;
        }
        public int NoOfNodes(Node root){
            if(root==null){
                return 0; 
            }
            int lcount=NoOfNodes(root.left);
            int rcount=NoOfNodes(root.right);
            return lcount+rcount+1;
        }
        public int SumOfNodes(Node root){
            if(root==null){
                return 0;
            }
            int lsum=SumOfNodes(root.left);
            int rsum=SumOfNodes(root.right);
            return lsum+rsum+root.data;
        }
        // diameter of tree is the longest distance b/w any 2 nodes
        public int diameter2(Node root){
            if(root==null){
                return 0;
            }
            int ldia=diameter2(root.left);
            int rdia=diameter2(root.right);
            int lh=height(root.left);
            int rh=height(root.right);
            int selfdia=lh+rh+1;

            return Math.max(ldia,Math.max(rdia,selfdia));
        }
        public static class Info{
            int diam;
            int ht;
            public Info(int diam,int ht){
                this.diam=diam;
                this.ht=ht;
            }
        }
        public static  Info diameter(Node root){
               Info leftInfo=diameter(root.left);
               Info rightInfo=diameter(root.right);
               int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),Math.max(leftInfo.ht,rightInfo.ht));
               int ht=Math.max(leftInfo.ht,rightInfo.ht);
               return new Info(diam,ht);
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Binarytree bt = new Binarytree();
        Node root = bt.ConstructTree(nodes);
        System.out.print("preorder: ");
        bt.preorder(root);
        System.out.print("inorder: ");
        bt.inorder(root);
        System.out.print("postorder: ");
        bt.postorder(root);
        System.out.println();
        System.out.print("levelorder:\n ");
        bt.levelorder(root);
        System.out.println("Height of the tree: "+bt.height(root));
        System.out.println("totalno of nodes : "+ bt.NoOfNodes(root));
        System.out.println("sum of roots: "+ bt.SumOfNodes(root));
        System.out.println("diameter of the tree: "+bt.diameter2(root));//o(n^2)
    }
}
