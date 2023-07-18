package pak;

import java.util.Scanner;

public class FactorOfNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=s.nextInt();
		System.out.println("factors of a number is:");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.print(i+" ");
				
		}
		
		s.close();
	}

}
