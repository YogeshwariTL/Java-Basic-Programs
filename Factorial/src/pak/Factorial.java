package pak;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=s.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("the factorial of a number is "+fact);
		
		s.close();
	}

}
