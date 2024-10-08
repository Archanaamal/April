package basicpgm;

import java.util.Scanner;

public class Reverseofnum {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0,temp;
		while(n!=0)
		{
			temp=n%10;
			rev=rev*10+temp;
			n=n/10;
		}
		System.out.println("Reverse of number:"+rev);

	}

}
