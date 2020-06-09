
public class Solution {

    public static void sort012(int[] arr){
    // creating new array of same size;
        
      /*  int temp[]= new int[arr.length];
        
        // copying first zero
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                temp[k++]=arr[i];
        }
        
        // copying 1
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1)
                temp[k++]=arr[i];
        }
         // copying 2
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2)
                temp[k++]=arr[i];
        }
        
        // copying back to origanl array
         // copying 1
        for(int i=0;i<arr.length;i++){
                arr[i]=temp[i];
        }
        
        //YOur code goes here
        
    }

}
*/
        int zero=0,one=0,two=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
				zero++;
			else if(arr[i]==1)
				one++;
			else
				two++;
		}
		for(int j=0;j<arr.length;j++)
		{
			if(j<zero)
				arr[j]=0;
			else if(j>=zero && j<zero+one)
				arr[j]=1;
			else
				arr[j]=2;
		}
    }
}