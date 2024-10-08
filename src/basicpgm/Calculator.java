package basicpgm;

public class Calculator {

	public static void main(String[] args) {
		int a=5,b=8,opt=7;
		switch(opt)
		{
		case 1:System.out.println("Addition");
		       int c=a+b;
		       System.out.println("sum of numbers="+c);
		       break;
		case 2:System.out.println("Subtraction");
		      int d=a-b;
		      System.out.println("Difference of numbers="+d);
		      break;
		case 3:System.out.println("MULTIPLICATION");
			  int e=a*b;
		      System.out.println("Multiplication of numbers="+e);
		      break;
		case 4:System.out.println("DIVISION");
			double f=b/a;
			System.out.println("Division of numbers="+f);
		      break;
		      default:System.out.println("Invalid option");
		}

	}

}
