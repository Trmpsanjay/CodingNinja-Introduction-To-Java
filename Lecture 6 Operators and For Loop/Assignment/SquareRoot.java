import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prevAns=0;
        int ans=0;
    	for(int i=0;i<=n/2+1;i++){
            prevAns=ans;
            ans=i;
            if(i*i>n)
                break;
        }
       
       
        System.out.print(prevAns);
		// Write your code here

	}
}
