package basicpgm;

import java.util.Scanner;

public class Twodarray {

	public static void main(String[] args) {
		int i,j,r,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row of arrar:");
		r=sc.nextInt();
		System.out.println("Enter the coloum of array:");
		c=sc.nextInt();
		int arr[][]=new int[r][c];
		System.out.println("Enter the values:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		


	}

}
