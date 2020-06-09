import java.util.Scanner;
public class Main {
        
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        int oddSum=0;
        int evenSum=0;
        while(n!=0){
            int rem=n%10;
            if(rem%2==0)
            	evenSum=evenSum+rem;
            else
                oddSum=oddSum+rem;
            n=n/10;
        }
        System.out.print(evenSum+"   "+oddSum);
        
		// Write your code here

	}
}
