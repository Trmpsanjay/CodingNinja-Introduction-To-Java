
public class Solution {

	public static int[] merge(int arr1[], int arr2[]){
        int newArr[]=new int[arr1.length+arr2.length];
        //initializing indexes
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                newArr[k]=arr1[i];
                k++;
                i++;
            }
            else{
                newArr[k]=arr2[j];
                k++;
                j++;
            }
        }
        
        //copying remaining element of arr1 in newArray
        while(i<arr1.length){
            newArr[k]=arr1[i];
                i++;
           		k++;
        }
         //copying remaining element of arr2 in newArray
        while(j<arr2.length){
            newArr[k]=arr2[j];
                j++;
           		k++;
        }
        return newArr;
    }
		
		/* Your class should be named Solution
	 	* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/		

