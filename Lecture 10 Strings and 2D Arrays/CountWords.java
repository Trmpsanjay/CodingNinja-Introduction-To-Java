
public class Solution {

	public static int countWords(String str){
        int count=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')
                count++;
        }
        return count;
	
		/* Your class should be named Solution
	 	* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/

	}
	

}
