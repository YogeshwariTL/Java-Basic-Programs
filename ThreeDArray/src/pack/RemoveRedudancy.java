package pack;

import java.util.Scanner;

public class RemoveRedudancy {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enetr length of 1D");
		int [][][]arr=new int[s.nextInt()][][];
		
		for(int i=0;i<arr.length;i++)
		   {
			System.out.println("Enter length of 2D for 1D "+i);
			arr[i]=new int[s.nextInt()][];
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("enter length of 3D for " +i+ " and "+j);
				arr[i][j]=new int[s.nextInt()];
			}
		 }
		for(int i=0;i<arr.length;i++)
		   {
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
				System.out.println("enter the marks of school "+i+" of class "+j+" of student "+k);
				arr[i][j][k]=s.nextInt();			
				}
		    }
		   }
		     System.out.println("Array contents are......:");
		     
		     for(int i=0;i<arr.length;i++)
		     {
			   for(int j=0;j<arr[i].length;j++)
			    {
				    for(int k=0;k<arr[i][j].length;k++)
				      {
				         System.out.print(arr[i][j][k]+" ");
				      }
				        System.out.println();
			}
			System.out.println("=================");
		     }
		     s.close();
		   }
	

}
