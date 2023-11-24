package Tries;
import java.util.*;
// tries are also trees but can have multiple children not only 2. tries are used to prevent storing--prefix-- again n again
// hence these are also called as prefix trees .tries came from re-trie-val(retrieval) trees.  
public class construction {
    
    public static class Node{
        Node children[]=new Node [26];
        boolean eow=false; // end of word
        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }
    public static Node root=new Node();

     public static void insert(String word){ //O(L) l- length of the longest string 
            Node curr=root;
            for(int i=0;i<word.length();i++){
                int idx=word.charAt(i)-'a';
                if(curr.children[idx]==null){
                    curr.children[idx]=new Node();
                }
                curr=curr.children[idx];
            }
            curr.eow=true;
        }
        public static boolean search(String word){
            Node curr= root;
            for(int i=0;i<word.length();i++){
                int idx=word.charAt(i)-'a';
                if(curr.children[idx]==null){
                    return false;
                }
                curr=curr.children[idx];
            }
            if(curr.eow){
                return true;
            }else{
                return false;
            }
        }
        
    public static void main(String[] args) {
        String words[]={"the","a","there","their","any","thee"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(search("ther"));
    }
    
}
