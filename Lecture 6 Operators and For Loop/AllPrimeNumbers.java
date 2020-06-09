import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int last=sc.nextInt();
		int count=0;

		for(int i=2;i<=last;i++){
			int flag=0;
			for(int j=2;j<i;j++){
				if(i%j==0){	
					flag=1;
					break;
				}
			}

		if(flag==0)
			System.out.println(i);
		}
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		
	}
}
