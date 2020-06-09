public class Solution {

	public static String compress(String inputString) {
        
        // need to solve again not working
		// int count =0;
		// String ans="";
		// int k=0;
		// for(int i=0;i<inputString.length();i=i+k){
		// k=0;
		// for(int j=i;j<inputString.length()-1;j++){
		// if(inputString.charAt(i)==inputString.charAt(j)){
		// count++;
		// k++;
		// }
		// else{
		// if(count>0){
		// ans = ans + inputString.charAt(i)+count;
		// }
		// else
		// ans = ans + inputString.charAt(i);
		// count=0;
		// k++;
		// break;
		// }
		// }
		// }
		// // Write your code here
		// return ans;
        
        
        
        
        // alternative approach
        String x="";
		x=x+inputString.charAt(0);
		int count=1;
		for(int i=1;i<=inputString.length();i++){

			if(i==inputString.length()) {
				if(count>1) {
					x=x+(char)(count+'0');
				}
				
			}

			else if(x.charAt(x.length()-1)==inputString.charAt(i)) {
				count++;
			}
			else {
				if(count>1) {
					x=x+(char)(count+'0');
				}
				x=x+inputString.charAt(i);
				count=1;
			}

		}
		return x;
	}

}
