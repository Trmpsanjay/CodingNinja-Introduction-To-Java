import java.util.Scanner;
public class runner {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();
        
        for(int i=0;i< row ;i++){
            int val=row;
            int count=0;
            //number printing 
            for(int j=0;j<row;j++){
                count++;
                if(count==row-i){
                    System.out.print("*");
                    val--;
                }
                else
                	System.out.print(val--);
            }
            System.out.println();
            
            
        }
		// Write your code here

	}
}
