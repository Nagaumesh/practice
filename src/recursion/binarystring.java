package recursion;

public class binarystring {

    public static void string(int n, int lp,String str){   //lp=lastposition
        //bASE
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam
        string(n-1,0,str+"0");
        if(lp==0){
            string(n-1,1,str+"1");
        }
        // if(lp==0){
        // //zero
        // sb.append("0");
        // lp=0;
        // string(--n,lp,sb);
        // //one
        // sb.append("1");
        // lp=1;
        // string(--n,lp,sb);
        // }
        // else{
        // sb.append("0");
        // string(--n,lp,sb);
        // }
    }
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("");
        String str="";
        string(4,0, str );
    }
    
}
