
import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//         int row = sc.nextInt();
//         int mid=(row+1)/2;
//         //printing upper half
//         for(int i=1;i<=mid;i++){
//             for(int space=mid-i-1;space>=0;space--){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
		
//        // printing lower half
//         for(int i=1;i<=mid-1;i++){
//             //space printing
//             for(int space=1;space<=i;space++)
//                 System.out.print(" ");
//             //star printing
//             for(int j=2*(mid-1)-1;j>=0;j=j-2)
//                 System.out.print("*");
//             System.out.println();
//         }
        
         int n, i, j, space = 1,row;
			row = sc.nextInt();
            n = (row+1)/2;
            space = n - 1;
            for (j = 1; j <= n; j++) {
            	for (i = 1; i <= space; i++) {
                    System.out.print(" ");
                }
                space--;
                for (i = 1; i <= 2 * j - 1; i++) {
                    System.out.print("*");                
                }
                System.out.println("");
            }
            space = 1;
            for (j = 1; j <= n - 1; j++) {
                for (i = 1; i <= space; i++) {
                    System.out.print(" ");
                }
                space++;
                for (i = 1; i <= 2 * (n - j) - 1; i++) {
                	 System.out.print("*");
                }
                System.out.println("");

            }

        // Write your code here
        
    }
}