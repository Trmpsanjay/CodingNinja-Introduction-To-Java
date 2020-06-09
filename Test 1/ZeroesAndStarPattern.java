import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
        
        
        
        /* dekhan me lage bda chhot lekin ganv kare bda gambhir  */
        Scanner sc = new Scanner(System.in);
  		int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i==j)
                    System.out.print("*");
                else
                    System.out.print("0");
            }
        	j--;
        	System.out.print("*");
        	while(j>0){
            	if(i==j)
                	System.out.print("*");
                else
                    System.out.print("0");
                j--;
            
        	}
            System.out.println();
        }

		/*  Read input as specified in the question.
    		 * Print output as specified in the question.
    		 */
		
	}	


}
