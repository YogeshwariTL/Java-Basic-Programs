package pack;

import java.util.Scanner;

public class PrintPrimeNumberInRange {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int last=s.nextInt();
        for(int num=0;num<=last; num++) {
        if(isPrime(num))
        {
		System.out.print(num+" ");
			
		}
        s.close();
	}
	}
static boolean isPrime(int num) {
	if(num<2)
	{
		return false;
	}
	 for(int i=2;i<=num/2;i++){
		   if(num % i == 0)
			  return false;
	 }
		     return true;
	        
	}
    }


	
        	



