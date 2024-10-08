package basicpgm;

public class operators {

	public static void main(String[] args) {
		//Addition
		int a=10,b=20;
		int sum=a+b;
		System.out.println("Sum = "+sum);
		
		int c=15,d=18;
		System.out.println("Sum is = "+(c+d));
		
		//Subtraction
		int sub=a-b;
		System.out.println("sub= "+sub);
		
		//Multiplication
		int mul=c*d;
		System.out.println("Mul= "+mul);
		
		System.out.println("Multi ="+(a*b));
		
		//Division
		int e=1,f=2;
		double div=e/f;
		System.out.println("Div= "+div);
		
		//Reminder
		double rem=c%d;
		System.out.println("Rem= "+rem);
		
		//Relational Operators
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		boolean v=c>d;
		System.out.println(v);
		
		//unary operators
		
		int p=20,r=25;
		System.out.println(p++);
		System.out.println(p);
		
		int q=20;
		System.out.println(++q);
		
		System.out.println(r--);
		System.out.println(r--);
		System.out.println(r);
		
		int y=50;
		System.out.println(--y);
		
		//Logical Operators
		
		String username="abcd123";
		String password="Abc@123";
		System.out.println(username== "abcd123" &&password =="Abc@123");
		System.out.println(username=="abc123" || password == "Abc@123");
		System.out.println(username != "abcd12" );
		System.out.println(password != "Abc@123");
	}

}
