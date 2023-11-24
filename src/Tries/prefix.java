package Tries;
import java.util.*;
public class prefix {
     
    public static class Node{
        Node children[]=new Node [26];
        boolean eow=false; // end of word
        int freq=0;
        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }
    public static Node root=new Node();

    
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
         public static void insert(String word){ //O(L) l- length of the longest string 
            Node curr=root;
            for(int i=0;i<word.length();i++){
                int idx=word.charAt(i)-'a';
                if(curr.children[idx]==null){
                    curr.children[idx]=new Node();
                }
                curr.children[idx].freq++;
                curr=curr.children[idx];
            }
            curr.eow=true;
        }
        public static ArrayList<String> prefixes(String[] words){
            ArrayList<String> ans=new ArrayList<>();
            for(int i=0;i<words.length;i++){
                String word=words[i];
                String temp="";
                Node curr=root;
                 for(int j=0;j<word.length();j++){
                    int idx=word.charAt(j)-'a';
                    if(curr.children[idx].freq>1){
                        temp=temp+word.charAt(j);
                        curr=curr.children[idx];
                    }else{
                        temp=temp+word.charAt(j);
                        break;
                    }
                 }
                 ans.add(temp);
            }
            return ans;
        }
    public static void main(String[] args) {
        String words[]={"zebra","dog","dove","duck"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        ArrayList<String> ans=prefixes(words);
        System.out.println(ans);
        // System.out.println(search("zebra"));
    }
}
