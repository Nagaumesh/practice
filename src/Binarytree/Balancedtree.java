package Binarytree;

import java.util.*;

public class Balancedtree {

    public static class Node {
        int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class Info {
        boolean bool;
        int min;
        int max;
        int size;

        Info(boolean bool, int size, int min, int max) {
            this.bool = bool;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

        static int maxBST = 0;

        // to find the biggest bst in the given tree it must return no of nodes
        public static Info isbst(Node root) {
            if (root == null) {
                return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
            }
            Info leftinfo = isbst(root.left);
            Info rightinfo = isbst(root.right);
            int size = leftinfo.size + rightinfo.size + 1;
            int min = Math.min(root.data, Math.min(leftinfo.min, rightinfo.min));
            int max = Math.max(root.data, Math.max(leftinfo.max, rightinfo.max));
            if (root.data <= leftinfo.max || root.data >= rightinfo.min) {
                return new Info(false, size, min, max);
            }

            if (leftinfo.bool && rightinfo.bool) {
                maxBST = Math.max(maxBST, size);
                return new Info(true, size, min, max);
            }
            return new Info(false, size, min, max);

        }

    public static Node balance(int arr[], int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(arr[mid]);
        root.left = balance(arr, st, mid - 1);
        root.right = balance(arr, mid + 1, end);
        return root;
    }

    public static void main(String[] args) {
        // let an graph be
        /*
                   60
                  /  \
                 45  70
                    /  \
                   65  80
                   expected ans is 5
         */
        Node root=new Node(60);
        root.left=new Node(45);
        root.right=new Node(70);
        root.right.left=new Node(65);
        root.right.right=new Node(80);
        Info info=isbst(root);
        System.out.println(maxBST);
                 
                
        // int arr[] = { 3, 5, 6, 8, 10, 11, 12 };
        // Node root = balance(arr, 0, arr.length - 1);
        // System.out.println(root.right.right.data);
    }
}
