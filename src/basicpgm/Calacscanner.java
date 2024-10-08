package basicpgm;

import java.util.Scanner;

public class Calacscanner {

	public static void main(String[] args) {
		int a,b,op;
		Scanner calc=new Scanner(System.in);
		System.out.println("Enter the option:1.ADDITION 2.SUBTRACTION 3.MULTIPLICATION 4.DIVISION");
		op=calc.nextInt();
		System.out.println("Enter first number=");
		a=calc.nextInt();
		System.out.println("Enter the second number");
		b=calc.nextInt();
		switch(op) 
		{
		case 1:System.out.print("Addition");
			   System.out.print("Sum of two numbers:"+(a+b));
			   break;
		case 2:System.out.println("Subtraction");
				System.out.println("DIFFERENCE of two numbers:"+(a-b));
				break;
		case 3:System.out.println("Multiplication");
				System.out.println("Product of two numbers:"+(a*b));
				break;
		case 4:System.out.println("Division");
				System.out.println("Division of two numbers:"+(a/b));
				break;
		default:System.out.println("invalid option");
		}

	}

}
