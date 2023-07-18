package pack;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int year=s.nextInt();
		String res=((year%400==0)||(year%4==0 && year%100!=0))?"leap Year":"not a leap Year";
		System.out.println("the entered year is "+res);
		s.close();
	}

}
