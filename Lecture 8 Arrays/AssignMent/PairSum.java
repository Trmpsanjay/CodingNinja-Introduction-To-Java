import java.util.*;;
public class Solution{  
   
    public static void pairSum(int arr[], int x) {
         int arr1[]=new int[1000];
        int size=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j])==x){
                    
                    if(arr[i]>arr[j])
                        System.out.println(arr[j]+" "+arr[i]);
                    else
                    	System.out.println(arr[i]+" "+arr[j]);
                    
               
                }
                
            }
        }
        /* Your class should be named Solution 
         * Don't write main(). 
         * Don't read input, it is passed as function argument. 
         * Print output and don't return it. 
         * Taking input is handled automatically. 
         */

    }
}