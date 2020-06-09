import java.util.Scanner;
public class Solution {
    


	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt(); 
        int num1 = 0, num2 = 1;
        int sumOfPrevTwo=0;

        for (int i = 1; i < n; i++){
            sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
        System.out.println(sumOfPrevTwo);
            
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		
	}

}
