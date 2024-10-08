package basicpgm;


public class Methods {

	public static void main(String[] args) {
	Methods m=new Methods();
	m.sum();
	m.sub(30,20);
	//m.mul(20, 20);
	System.out.println("muliplication:"+m.mul(20, 2));
	m.div();
		
	}
	//1 --without return type without parameter
	public void sum()
	{
		int a=10,b=17;
		int c=a+b;
		System.out.println("sum: "+c);
	}
	
	//2--without return type and with parameters
	public void sub(int c,int d)
	{
		int e=c-d;
		System.out.println("difference of nums:"+e);
	}
	
	//3--with return type and with parameter
	public int mul(int f,int g)
	{
		int mul=f*g;
		//System.out.println("multiplication:"+mul);
		return mul;
	}
	
	//4--with return type and without parameters
	public double div()
	{
		int h=5,i=2;
		double div=h/i;
		System.out.println("Division:"+div);
		return div;
	}

}
