public class Solution {  

    public static void rotate(int[] arr, int d) {
        /*int temp[]=new int[arr.length];
            int j=0;
        for(int i=d;i<arr.length;i++,j++){
            temp[j]=arr[i];
            
        }
        for(int i=0;i<d;i++,j++){
            temp[j]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
    }
 }   
        //method 2 should be done later
        //Your code goes here
        */
        for(int i=arr.length-1;i>=d;i--)
        {
            arr[i-d]=arr[i];
        }
            int j=0;
        int i=arr.length-d;
            while(j<d)
            {
            arr[i]=arr[j];
                j++;
                i++;
             }  
      }
}
  