package Tries;
import java.util.*;
public class WordBreak {
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

     public static void insert(String word){ //O(L) L- length of the longest string 
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
        public static boolean wordbreak(String word){
            Node curr=root;
            for(int i=0;i<word.length();i++){
                int idx= word.charAt(i)-'a';
                if(curr.children[idx]==null){
                    return false;
                }
                curr=curr.children[idx];
                if(curr.eow==true){
                    curr=root;
                }
            }
            if(curr.eow=true){
                 return true;
            }else{
                return false;
            }
            
        }
    public static void main(String[] args) {
        String words[]={"i","like","sam","samsung","am","umesh"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        String  word="ilikeumesh";
        // System.out.println(search(""));
        System.out.println(wordbreak(word));
    }
    
}
