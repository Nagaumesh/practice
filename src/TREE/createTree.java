package TREE;

import java.util.LinkedList;
import java.util.Queue;

import Binarytree.Balancedtree.Node;

public class createTree {
    
}
private Node createTree(int[] levelOrderTraversal) {
    Queue<Node> queue = new LinkedList<>();
    Node root = new Node(levelOrderTraversal[0]);
    queue.add(root);

    for (int i = 1; i < levelOrderTraversal.length; i++) {
        Node node = queue.poll();
        if (levelOrderTraversal[i] != -1) {
            node.left = new Node(levelOrderTraversal[i]);
            queue.add(node.left);
        }
        i++;
        if (i < levelOrderTraversal.length && levelOrderTraversal[i] != -1) {
            node.right = new Node(levelOrderTraversal[i]);
            queue.add(node.right);
        }
    }

    return root;
}