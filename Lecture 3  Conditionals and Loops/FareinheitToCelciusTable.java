import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        int step=sc.nextInt();
        int sol;
        for(int i=start;i<=end;i=i+step){
            sol=(i-32)*5/9;
            System.out.println(i+"\t"+sol);
        }
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		
	}

}
