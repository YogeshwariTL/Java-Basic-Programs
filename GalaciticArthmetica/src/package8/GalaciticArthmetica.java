package package8;

import java.util.Scanner;

public class GalaciticArthmetica {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			long num1=scan.nextLong();
			long num2=scan.nextLong();
			long result=galaciticAddition(num1,num2);
			System.out.println("Addition of to number is:"+result);
			
			scan.close();
		}
		public static long galaciticAddition(long num1,long num2)
		{
			return num1+num2;
			
		} 


	}



