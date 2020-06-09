import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        
        for(int i=1;i<=x;i++){
            int ans=3*i+2;
            if(ans%4==0){
                 x++;
            }
               
            else
                System.out.print(ans+" ");
        }
		// Write your code here

	}
}
