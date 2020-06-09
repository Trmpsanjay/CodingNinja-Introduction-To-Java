
public class Solution {

    public static int arrayRotateCheck(int[] arr){
        // int count=1;
        // for(int i=0;i<arr.length-1;i++){
        //     if(arr[i]<=arr[i+1])
        //         count++;
        //     else
        //         break;
        // }
        // if(count==arr.length-1)
        //     return 0;
        // else
        // 	return count;
   // }
//}
        
        
        //efficient sol
        int c=0,i=0;
        for(i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
            	c++;
            break;}
            else
            c=0;
        }
        if(c>0)
            return i+1;
        else
            return 0;
    }
}
  
        //Your code goes here

