public class Solution {

	public static void printFahrenheitTable(int start, int end, int step) {
        for(int i=start;i<=end;i=i+step){
            int ans=(i-32)*5/9;
            System.out.println(i+" "+ans);
        }
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print the specified output in required format. 
		 * Taking input is handled automatically. 
		 */
		
	}
}