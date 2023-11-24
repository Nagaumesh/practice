package recursion;

public class decorder {
    public static void decreasing(int n){
        System.out.print(n+" ");
        if(n==0){
            return ;
        }
        decreasing(n-1);
    }
    public static void increasing(int n){
        if(n==0){
            return;
        }
        increasing(n-1);
        System.out.print(n+" ");
    }
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int sumofn(int n){
        if(n==1){
            return 1;
        }
        return n+sumofn(n-1);
    }

    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static boolean ascending(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return ascending(arr,i);
    }

    public static int firstoccurence(int arr[],int key,int i){
        if(arr[i]==key){
            return i;
        }
        else{
            if(i==arr.length-1){
                return -1;
            }
            return firstoccurence(arr, key, --i);
        }
        
    }

    public static double power(int x,int n){
        if(n==0){
            return 1;
        }
        if( n%2==0){ //even
            return Math.pow(x,n/2)*Math.pow(x,n/2);
        }else{
         return x*Math.pow(x,n/2)*Math.pow(x,n/2);
        }
    }
    
    public static void main(String[] args) {
    //  decreasing(10);   
    // increasing(10);
    // System.out.println(factorial(5));
    // System.out.println(sumofn(5));
    // System.out.println(fibonacci(25));
    int arr[]={1,5,3,8,5};
    // System.out.println(ascending(arr, 0));
    // System.out.println(firstoccurence(arr, 5, arr.length-1));
    System.out.println(power(2,3));
    }
}
