import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //counting no of digits for power
        int temp = n;
        int count=0;
        while(temp>0){
            count++;
            temp=temp/10;
        }
        //calculation number;
        int pow=0;
        double ans=0;
        for(int i=0;i<count;i++){
            ans = ans +n%10*Math.pow(2,pow++);
            n=n/10;
        }
        System.out.print((int)ans);
		// Write your code here

	}
}
