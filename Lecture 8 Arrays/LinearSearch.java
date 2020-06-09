public class Solution {
    public static int linearSearch(int arr[], int val) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val)
                return i;
        }
        return -1;
        //Your Code Goes Here
    }
}