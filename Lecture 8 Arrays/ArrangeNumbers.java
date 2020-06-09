
public class Solution {
    
    public static void arrange(int[] arr, int n) {
        int mid =(n-1)/2;
        if(n%2!=0){
            int val=1;
            for(int i=0;i<=mid;i++){
                arr[i]=val;
                val=val+2;
            }
            val=n-1;
            for(int i=mid+1;i<n;i++){
                arr[i]=val;
                val=val-2;
            }
        }
        else{
            int val=1;
            for(int i=0;i<=mid;i++){
                arr[i]=val;
                val=val+2;
            }
             val=n;
            for(int i=mid+1;i<n;i++){
                arr[i]=val;
                val=val-2;
            }
            
        }
        /*
            Your Code goes here
            You only need to fill the array in the order asked for.
            Printing of the array is taken care at our end.
        */
            

    }

}