import java.util.Scanner;
public class Main {
    
    
    // note you will get error if you use  int type because our ans is beyond int range
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //counting no of digits for power
       long ans=0;
        
       long pv=1;
        while (n > 0){
           int remainder = n % 2;
            n /= 2;
             ans = ans + remainder * pv;
            pv= pv*10;
        }
        System.out.print(ans);
		// Write your code here

	}
}
