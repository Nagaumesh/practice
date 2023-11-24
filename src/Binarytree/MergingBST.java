package Binarytree;
import java.util.*;

public class MergingBST {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void getinorder(Node root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        getinorder(root.left,arr);
        arr.add(root.data);
        getinorder(root.right, arr);
    }
    public static Node createbst(ArrayList<Integer> arr,int si,int ei){
        if(si>ei){
            return null;
        }
        int mid=(si+ei)/2;
        Node root=new Node(arr.get(mid));
        root.left=createbst(arr,si,mid-1);
        root.right=createbst(arr,mid+1,ei);
        return root;
    }

    public static Node merge(Node root1,Node root2){
        //step-1 find inorders ofthe given bsts
        ArrayList<Integer> arr1=new ArrayList<>();
        getinorder(root1,arr1);
        ArrayList<Integer> arr2=new ArrayList<>();
        getinorder(root2,arr2);
        //combine 2 inorders
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0,j=0;
        while(i<arr1.size()&&j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                ans.add(arr1.get(i));
                i++;
            }else{
                ans.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()){
             ans.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()){
            ans.add(arr2.get(j));
            j++;
        }
        //create a bst
        return createbst(ans,0,ans.size()-1);
    }
    public static void printinorder(Node root){
        if(root==null){
            return;
        }
        printinorder(root.left);
        System.out.print(root.data+" ");
        printinorder(root.right);
    }


    
    public static void main(String[] args) {
        /*
               2
              / \
             1  4  -bst-1
         */
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);

         /*
               9
              / \
             3  12  -bst-2
         */
        Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);
        //now we should merge
        Node root=merge(root1,root2);
        printinorder(root);
    }
    
}
