public class Solution{  

    public static int binarySearch(int[] arr, int val) {
       /* int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==val)
                return mid;
            else if(arr[mid]>val)
                end=mid-1;
            else
                start=mid+1;
        }
        //Your code goes here
	return -1;
    }

}*/
        
int s=0,e=arr.length-1;
        while(s<=e){
            int mid=s+e/2;
        if(val==arr[mid])
         return mid;
         else if(val<arr[mid])
         e=mid-1;
        else
          s=mid+1;
        }
        return -1;
    }
}