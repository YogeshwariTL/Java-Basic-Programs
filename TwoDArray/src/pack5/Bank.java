package pack5;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	String [][]arr=new String[6][];
	     arr[0]=new String[2];
	     arr[1]=new String[7];
	     arr[2]=new String[3];
	     arr[3]=new String[2];
	     arr[4]=new String[4];
	     arr[5]=new String[5];
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.println("enter the holder name of "+j+" of bank "+i);
			arr[i][j]=s.nextLine();			}
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
