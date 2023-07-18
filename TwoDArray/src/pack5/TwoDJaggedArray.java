package pack5;

import java.util.Scanner;

public class TwoDJaggedArray {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter length of 1D");
		int n=s.nextInt();
		int [][]arr=new int[n][];
		    for(int i=0;i<arr.length;i++)
		    {
		    	System.out.println("enter 2D length of "+i+ " Array ");
		        arr[i]=new int[s.nextInt()];
		    }
		   for(int i=0;i<arr.length;i++)
		   {
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("enter the score of player "+j+" of game "+i);
				arr[i][j]=s.nextInt();			}
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

