
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		long ans = 0, pv= 1;
		while(n > 0) {
			int k = n % 2;
			ans += k * pv;
			pv *= 10;
			n = n / 2;
		}
		System.out.println(ans);
	}
}
