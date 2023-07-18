package pack;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean isPrime=true;
		int num=s.nextInt();
		if(num<2){
			isPrime=false;	
		}
		else {
			for(int i =2;i<=num/2;i++) {
				if(num % i == 0) 
				{
					isPrime=false;
					break;
			  }
			}
		}
		
		String res=isPrime?"prime":"Not Prime";
		System.out.println("the number "+num+" is "+res);
	    s.close();
		
	}

}
