public class Solution {

	// Return the reversed string. No need to print
	public static String reverseEachWord(String input) {
        
        String newAns="";
        int prev=0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==' '){
                for(int j=i-1;j>=prev;j--){
                    newAns = newAns + input.charAt(j);
                }
                newAns = newAns + " ";
                prev = i+1;
            }
        }

        String lastWord="";
        int k=input.length()-1;
        while(input.charAt(k)!=' '){
            lastWord = lastWord + input.charAt(k--);
        }
        //System.out.println(firstWord);
        return newAns+lastWord;
        
		// Write your code here

	}
}

   /* String newAns="";
        int prev=0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==' ' || input.charAt(i)=='/0'){
                for(int j=i-1;j>=prev;j--){
                    newAns = newAns + input.charAt(j);
                }
                newAns = newAns + " ";
                prev = i+1;
            }
        }
        return newAns;
    }
}*/      
