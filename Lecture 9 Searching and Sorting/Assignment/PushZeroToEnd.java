public class Solution {  
 public static void pushZerosAtEnd(int[] arr) {
        int count=0;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]==0)
           count++;
            }
   
     
        for(int j=arr.length-1;j>arr.length-1-count;j--)
        {
            arr[j]=0;
        }
     //method 2;
        
       /* int temp[] = new int[arr.length];
        int i=0,j=0;
        while(i<arr.length){
            if(arr[i]!=0){
                temp[j]=arr[i];
                j++;
            }
            i++;
        }
        //copying to given array
        for(i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
        
        //method 2 later
        
        //Your code goes here*/
      }
  }


