import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c=sc.next().charAt(0);
        //int a= (int)c;
        if(c>=97 && c<=122)
            System.out.println("0");
        else if(c>=65 && c<=90)
            System.out.println("1");
        else
            System.out.println("-1");
            
        // Write your code here

    }
}