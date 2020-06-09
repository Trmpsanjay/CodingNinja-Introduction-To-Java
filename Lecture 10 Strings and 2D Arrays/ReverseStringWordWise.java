public class Solution {
	public static String reverseWordWise(String input) {
        String ans = "";
        // reversing all string
        for(int i = input.length()-1;i>=0;i--){
            ans = ans + input.charAt(i);
        }
        // now reversing word
        String newAns="";
        int prev=0;
        for(int i=0;i<ans.length();i++){
            if(ans.charAt(i)==' '){
                for(int j=i-1;j>=prev;j--){
                    newAns = newAns + ans.charAt(j);
                }
                newAns = newAns + " ";
                prev = i+1;
            }
        }

        String firstWord="";
        int k=0;
        while(input.charAt(k)!=' '){
            firstWord = firstWord + input.charAt(k++);
        }
        //System.out.println(firstWord);
        return newAns+firstWord;
        
		// Write your code here

	}
}
