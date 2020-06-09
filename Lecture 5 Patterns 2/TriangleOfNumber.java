import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            // space printing
            for(int space=1;space<=row-i;space++)
                System.out.print(" ");
            //increasing number printing
            int val=i;
            for(int j=1;j<=i;j++)
    			System.out.print(val++);
            
            //decreasing number printing
            int valDe=val-2;
            for(int k=1;k<i;k++){
                System.out.print(valDe--);
            }
            System.out.println();
        }
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
	}
}
