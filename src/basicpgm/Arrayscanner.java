package basicpgm;

import java.util.Scanner;

public class Arrayscanner {

	public static void main(String[] args) {
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		int[] ar=new int[3];
		System.err.println("Enter 3 numbers:");
		for(i=0;i<3;i++)
		{
			ar[i]=sc.nextInt();	
		}
		System.out.println("Numbers are:");
		for(i=0;i<3;i++)
		{
			System.out.println(ar[i]+" ");
		}
		// Length of the array
		
		System.out.println("Enter the limit of array:");
		int z=sc.nextInt();
		int[] ary=new int[z];
		System.out.println("Enter the values:");
		for(j=0;j<z;j++)
		{
			ary[j]=sc.nextInt();
		}
		System.out.print("Numbers are:");
		for(j=0;j<z;j++)
		{
			System.out.print(ary[j]+" ");
		}

	}

}
