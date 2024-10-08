package basicpgm;

import java.util.Scanner;

public class Arraysum {

	public static void main(String[] args) {
		int i,sum=0;
		int[] ar=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 numbers:");
		for(i=0;i<5;i++)
		{
			ar[i]=sc.nextInt();
			sum=sum+ar[i];
		}
		System.out.println("Sum of numbers="+sum);
		

	}

}
