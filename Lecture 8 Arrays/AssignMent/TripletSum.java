import java.util.*;
public class Solution{  

    public static void findTriplet(int[] arr, int x){
        int i,j,k;
        for(i=0;i<arr.length-2;i++){
            for(j=i+1;j<arr.length-1;j++){
                for(k=j+1;k<arr.length;k++){
                    if((arr[i]+arr[j]+arr[k])==x){
                        int arr1[]=new int[3];
                        arr1[0]=arr[i];
                        arr1[1]=arr[j];
                        arr1[2]=arr[k];
                        //System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);

                        Arrays.sort(arr1);
                        System.out.println(arr1[0]+" "+arr1[1]+" "+arr1[2]);
                        //System.out.println(arr1[0]+" "+arr[1]+" "+arr1[2]);
                       // System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
            System.out.println();
        }
        
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print output and don't return it.
         * Taking input is handled automatically.
        */
        
    }
}