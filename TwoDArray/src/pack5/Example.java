package pack5;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter rows and columns");
		float [][]arr=new float[s.nextInt()][s.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("enter the Height of player "+j+" in game "+i);
				arr[i][j]=s.nextFloat();			}
		}
		System.out.println("Array contents are......:");
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



