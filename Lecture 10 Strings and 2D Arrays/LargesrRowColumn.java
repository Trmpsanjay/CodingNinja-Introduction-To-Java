
public class Solution {

	
	public static void findLargest(int input[][]){
        int row = input.length;
        int col = input[0].length;
        int rowSum =Integer.MIN_VALUE;
        int colSum =Integer.MIN_VALUE;
        int rowNum =0;
        int colNum=0;
        
        // finding max sum rowwise
        for(int i=0;i<row;i++){
            int sum=0;
            for(int j=0;j<col;j++)
                sum = sum + input[i][j];
            if(sum>rowSum){
                rowSum = sum;
                rowNum =i;
            }
        }
        
        // finding column sum;
        
        for(int i=0;i<col;i++){
            int sum=0;
            for(int j=0;j<row;j++)
                sum = sum + input[j][i];
            if(sum>colSum){
                colSum = sum;
                colNum = i;
            }
        }
        
        if(colSum>rowSum){
            System.out.println("column "+colNum+" "+colSum);
        }
        else
            System.out.println("row "+rowNum+" "+rowSum);
		
		/* Your class should be named Solution.
		* Don't write main() function.
	 	* Don't read input, it is passed as function argument.
	 	* Print output as specified in the question
		*/


	}

	
}
