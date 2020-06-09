import java.util.Scanner;
public class Solution{	
	
	public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
    
        for(int i=0;i<n;i++){
          
            for(int j=1;j<arr.length;j++){
                if(arr[i]!=arr[j]){
              System.out.print(arr[i]);
                }
               
            }
        }
   
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		
	}
}