package bitmanipulation;

public class basics {

    public static void eveodd(int num){
        int bitmask=1;
        if((num & bitmask)==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }

    public static int getbit(int num,int i){
        int bitmask=1;
        bitmask=bitmask << i;
        if((bitmask&num) ==0){
            System.out.println("0");
            return 0;
        }else{
            System.out.println("1");
            return 1;
        }

    }

    public static int setbit(int num,int i){
        int  bitmask=1;
        bitmask=bitmask<<i;
        System.out.println(bitmask|num);
        return bitmask|num;
    }
    public static int clearbit(int num,int i){
        int  bitmask=1;
        bitmask=bitmask<<i;
        bitmask=~bitmask;
        System.out.println(bitmask&num);
        return bitmask&num;
    }
    public static int rangeofbits(int num,int i,int j){
        int  bitmask=((~0)<<j+1)|((1<<i)-1);//2^i-1
        System.out.println(bitmask&num);
        return bitmask&num;
    }
    public static int ranngeofbits(int num,int i,int j){
        int temp=j-i+1;
        int bitmask=~(((1<<temp)-1)<<i);
        System.out.println(bitmask&num);
        return bitmask&num;
    }
    public static int fastexpo(int a,int n){ // a^n
        int ans=1;
        while(n>0){
            if((n&1)==1){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    
        
    }
    public static void main(String[] args) {
        // eveodd(6);
        // getbit(6,2);
        // setbit(9,0);
        // clearbit(9,3);
        // rangeofbits(309,2,5);
        // ranngeofbits(309,2,5);


    }
    
}
