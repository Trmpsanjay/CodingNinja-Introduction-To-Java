public class Solution {

    public static void swapAlternate(int arr[]) {
        for(int i=0;i<arr.length-1;i=i+2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        
        /* Your class should be named Solution.
        * Don't write main().
        * Don't read input, it is passed as function argument.
        * Taking input and printing output is handled automatically.
        */          

        
    }
    
}