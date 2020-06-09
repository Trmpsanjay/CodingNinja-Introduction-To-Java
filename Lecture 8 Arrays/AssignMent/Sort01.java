import java.util.Scanner;
public class Solution{  

    public static void sortZeroesAndOne(int[] arr) {
        
        //can be solved easily by making another array;
        
//         int temp[] = new int[arr.length];
        
//         //copying zero;
//         int k=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==0)
//                 temp[k++]=arr[i];
//         }
        
//         // copying 1
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]!=0)
//                 temp[k++]=arr[i];
//         }
        
//         // changing in original array
//         for(int i=0;i<arr.length;i++){
//             arr[i]=temp[i];
//         }
        
        //here solving in same array;  now working
        while(i<j){
            if(arr[i]!=0 && arr[j]==0){
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j--;
                i++;
            }
            else if(arr[i]==0)
                i++;
            else
                j--;
        }
        

    }
}