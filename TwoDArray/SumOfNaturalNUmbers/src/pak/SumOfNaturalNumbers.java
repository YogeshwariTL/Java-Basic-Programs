package pak;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("sum of natural number is "+sum);
		
		s.close();
	}


}
