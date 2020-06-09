import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        for(int i=2;i<=n;i++){
            if(i%2==0)
                sum=sum+i;
        }
        System.out.println(sum);
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		
	}

}
