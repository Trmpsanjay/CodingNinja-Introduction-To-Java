import java.util.*;
public class Solution {  

    public static int secondLargestElement(int[] arr) {
        
        /*Arrays.sort(arr);
        int ans=0,count=0;;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=arr[i-1]){
                count++;
            }
            if(count==2){
                 ans=arr[i];
                 break;
            }
                
        }
        //Your code goes here
        return ans;
    }

}
*/
        Arrays.sort(arr);
        if(arr.length<=1)
            return -2147483648;
        else
        return arr[arr.length-2];
    }
}