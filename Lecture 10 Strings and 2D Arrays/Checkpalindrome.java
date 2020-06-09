
public class Solution {

	public static boolean checkPalindrome(String str){
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
     int i=0;
        int j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i++)!=str.charAt(j--))
            return false;
        }
        return true;
	}
}
