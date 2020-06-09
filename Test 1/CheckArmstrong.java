import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int temp=n;
        // calculating number of digits
        while(n>0){
            count++;
            n=n/10;
        }
        
        // calculating number;
        double ans=0;
        n=temp;
        while(n>0){
            int rem = n%10;
            ans = ans + Math.pow(rem,count);
            n=n/10;
        }
        //typecasting it to integer
        int myans=(int)ans;
        // checking number resultanant number is equal to given number or not
        if(myans==temp)
            System.out.println("true");
        else
            System.out.println("false");
        
        
		/*  Read input as specified in the question.
    		 * Print output as specified in the question.
    		 */
		
	}	


}
