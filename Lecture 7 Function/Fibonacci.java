
public class Solution {
    private static int fibonnaci(int n){
        int sumOfPrevTwo=0,num1=0,num2=1;
         for (int i = 1; i < n; i++){
            sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
        return sumOfPrevTwo;
    }
	
	public static boolean checkMember(int n){
        for(int i=1;i<=n+1;i++){
            int ans=fibonnaci(i);
            //System.out.print(ans+" ");
            if(ans==n)
                return true;
            if(ans>n)
               break;
        }
			
        return false;
		/* Your class should be named Solution
		* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/

	}
	

}
