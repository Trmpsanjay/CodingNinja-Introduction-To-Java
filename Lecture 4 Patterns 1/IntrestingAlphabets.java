import java.util.*;
public class Solution {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=65,i,j;
        int n=sc.nextInt();
        int p=m+n;
        for(i=0;i<=n;i++){
            for(j=0;j<i;j++){
                System.out.print((char)p);
                p++;
            }
            p=p-j-1;
            System.out.println();
        }
		//Your code goes here
	}
}