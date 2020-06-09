import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int basic=sc.nextInt();
        float hra=basic*.20f;
        float da=basic*.50f;
        int allow=0;
        char grade=sc.next().charAt(0);
        if(grade=='A')
            allow=1700;
        else if(grade=='B')
            allow=1500;
        else
            allow=1300;
        float pf=basic*.11f;
       double total=basic+hra+da+allow-pf;
       
        System.out.println(Math.round(total));
		// Write your code here

	}
}
