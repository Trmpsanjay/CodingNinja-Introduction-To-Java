import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i=0;i<row;i++){
            int val =1;
            // for space printing
            for(int space=0;space<row-i-1;space++)
                System.out.print(" ");
            
            // for number printing()
            for(int j=0;j<=i;j++){
                System.out.print(val++);
            }
            //line changing
            System.out.println();
        }
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		
	}

}
