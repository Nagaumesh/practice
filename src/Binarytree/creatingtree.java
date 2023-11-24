package Binarytree;

import java.util.*;
import TREE.buildtreePreorder.Node;

public class creatingtree {

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val > root.data) {
            root.right = insert(root.right, val);

        } else {
            root.left = insert(root.left, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    // public static boolean present=false;
    public static boolean search(int val, Node root) {

        if (root == null) {
            return false;
        }
        if (root.data == val) {
            return true;
        }
        if (val < root.data) {
            return search(val, root.left);
        } else {
            return search(val, root.right);
        }

    }
    // deleting nodes

    public static Node delete(Node root, int val) {
        if (root == null) {
            return null;
        }
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            // case-1 leafnode
            if (root.right == null && root.left == null) {
                return null;
            }
            // case-2 if node contains one root
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            // case-3 two roots
            Node is = inordersucessor(root.right);
            root.data = is.data;
            root.right = delete(root.right, is.data);
        }
        return root;
    }

    public static Node inordersucessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printinrange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data <= k2 && root.data >= k1) {
            printinrange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printinrange(root.right, k1, k2);
        } else if (root.data >= k2) {

            printinrange(root.left, k1, k2);
        } else if (root.data <= k1) {

            printinrange(root.right, k1, k2);
        }
    }

    public static boolean IsaValidBst(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        }
        if (max != null && root.data >= max.data) {
            return false;
        }
        return IsaValidBst(root.left, min, root) && IsaValidBst(root.right, root, max);
    }// another method: print inorder if asscending true or false

    public static Node Mirror(Node root) {
        if (root == null) {
            return null;
        } else {
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
        root.left = Mirror(root.left);
        root.right = Mirror(root.right);
        return root;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        // int arr[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        // // int arr[]={1,2,3,9};
        // Node root = null;
        // for (int i = 0; i < arr.length; i++) {
        // root = insert(root, arr[i]);
        // }
        // // inorder(root);
        // // System.out.println(root.data);
        // // System.out.println(search(4, root));
        // // System.out.println();
        // // delete(root,6);
        // // inorder(root);
        // printinrange(root, 5, 10);
        // System.out.println(IsaValidBst(root, null, null));

        // 8
        // / \
        // 5 10
        // / \ / \
        // 3 6 n 11
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        Mirror(root);
        preorder(root);
    }
}
