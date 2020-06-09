import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pow = sc.nextInt();
        double ans =Math.pow(num,pow);
        int ansRound= (int) ans;
        System.out.print(ansRound);
        // Write your code here
        
    }
}