import java.util.HashMap;
public class solution {

	public static char highestOccuringCharacter(String inputString) {
        
//         // one test case is not passing
//         int arr[] = new int[256];
//         // storing frequency corresponding to their ascii value
//        // storing frequency
//         for(int i=0;i<inputString.length();i++){
//             int val = (int)inputString.charAt(i);// input.charAt(i) is explicitly convering to its ascii value
//             arr[val]=arr[val]+1; 
//         }
        
//         // finding max occuring charecter using ascii value;
//         int max=0;
//         int loc=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//                 loc=i;
//             }
//         }
//         // connverting into charecter
//        char c=(char)loc;  

//         return c;
        
        
        //soln using hashmap
        
        HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(int i=0;i<inputString.length();i++) {
			if(map.containsKey(inputString.charAt(i))) {
				map.put(inputString.charAt(i), map.get(inputString.charAt(i))+1);
			}else {
				map.put(inputString.charAt(i),1);
			}
		}
		int max=Integer.MIN_VALUE;
		char maxChar='\0';
		for(int i=0;i<inputString.length();i++) {
			if(max<map.get(inputString.charAt(i))) {
				max=map.get(inputString.charAt(i));
				maxChar=inputString.charAt(i);
			}
		}
		return maxChar;
        
		// Write your code here

	}
}
