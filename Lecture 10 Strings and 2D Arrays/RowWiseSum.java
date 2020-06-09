import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][]= new int[row][col];
        
        // taking input
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // calculating sum 
        for(int i=0;i<row;i++){
            int sum=0;
            for(int j=0;j<col;j++){
                sum = sum + arr[i][j];
            }
            System.out.print(sum+" ");
        }
        
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

	}
}
