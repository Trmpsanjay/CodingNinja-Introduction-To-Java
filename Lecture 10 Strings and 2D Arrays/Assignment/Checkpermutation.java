public class solution {

	public static boolean isPermutation(String input1, String input2) {
        
        
        // below program is not passing 3 test case
        //method  2 : sort and check every indexes 
        
        
        
        if(input1.length()!=input2.length())
            return false;
        // solving for single length;
        if(input1.length()==1 && input2.length()==1){
            if(input1.charAt(0)!=input2.charAt(0))
                return false;
        }
        int arr[] = new int[256];
        
        // storing frequency
        for(int i=0;i<input1.length();i++){
            int val = (int)input1.charAt(i);
            arr[val]=arr[val]+1; // input.charAt(i) is implicitly convering to its ascii value
        }
        // decreasing frequency
        for(int i=0;i<input2.length();i++){
            int val = (int)input2.charAt(i);
            arr[val]=arr[val]-1;
        }
        // now checkin if every value at index i is zero or not
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
                return false;
        }
        return true;
        
	    // Write your code here

	}
}
