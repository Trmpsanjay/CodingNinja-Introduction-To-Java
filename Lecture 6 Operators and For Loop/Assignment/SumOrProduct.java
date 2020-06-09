import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int choice=sc.nextInt();
        if(choice==1){
            int sum=0;
            for(int i=1;i<=n;i++){
                sum=sum+i;
            }
            System.out.println(sum);
                
        }
        else if(choice==2){
            long product=1;
            for(int i=1;i<=n;i++)
                product=product*i;
            System.out.println(product);
        }
        else
             System.out.println("-1");
        
		// Write your code here

	}
}
