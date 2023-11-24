package arrays;

public class trappingwater {
    
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        int total=0;
        /*  tw- trapped water
            wl- water level
            bl- base level
            lm- left max
            rm- right max
        */
         //tw=wl-bl;
        int tw,wl,bl,lm=0,rm=0;
        

        for(int k=1;k<arr.length-1;k++){
            rm=0;lm=0;
            for(int i=k+1;i<arr.length;i++){
            rm=Math.max(arr[i],rm);
            }

            for(int j=k-1;j>=0;j--){
            lm=Math.max(arr[j],lm);
            }
            // System.out.println("for "+k+"  lm: "+lm+"  rm: "+rm);
            wl=Math.min(rm,lm);
            bl=arr[k];
            tw=wl-bl;
            if(tw<0){
                tw=0;
            }
            // System.out.println("for "+k+" : "+ tw);
            total=total+tw;
        }
        System.out.println("total water level stored: "+total);
       
    
        
    }
}
