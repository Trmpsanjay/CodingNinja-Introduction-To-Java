public class solution {

	public static String removeConsecutiveDuplicates(String input) {
        /*String ans = "";
        for(int i=0;i<input.length()-1;i++){
            if(input.charAt(i)!=input.charAt(i+1)){
                ans = ans + input.charAt(i);
            }
        }
        //adding last charecter
        //if(input.charAt(input.length-1)!=input.charAt())
        return ans+input.charAt(input.length()-1);
	    // Write your code here

	}
}
*/
        String ans="";
        for(int i=0;i<input.length()-1;i++)
        {
            if(input.charAt(i)!=input.charAt(i+1))
                ans=ans+input.charAt(i);
        }
        ans=ans+input.charAt(input.length()-1);
        return ans;
    }
}