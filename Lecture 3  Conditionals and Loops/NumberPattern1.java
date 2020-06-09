import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int val=i;
            for(int j=1;j<=i;j++){
                System.out.print(val);
                    val++;
            }
            System.out.println();
        }
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		
	}

}
