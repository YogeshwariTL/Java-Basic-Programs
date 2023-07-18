package pack5;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int [][]arr=new int[2][5];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("enter the marks of class "+i+" student "+j);
				arr[i][j]=s.nextInt();			}
		}
		System.out.println("student marks is:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		s.close();
		
	}

}
