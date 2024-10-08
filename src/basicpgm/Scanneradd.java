package basicpgm;

import java.util.Scanner;

public class Scanneradd {

	public static void main(String[] args) {
		System.out.println("Enter first number:");
		Scanner add=new Scanner(System.in);
		int a,b;
		a=add.nextInt();
		System.out.println("Enter second number:");
		b=add.nextInt();
		System.out.println("Sum of two numbers="+(a+b));

	}

}
