public class Solution{  

    public static int duplicateNumber(int arr[]) {
        int ans=0,count=0;
        for(int i=0;i<arr.length;i++){
            count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j])
                    count++;
                if(count>=2){
                    ans=arr[i];
                    break;
                }
            }
        }
        
        return ans;
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
        */
    }
}