package basicpgm;

public class Ifcondition {

	public static void main(String[] args) {
		int a=45,b=50;
		if(a>b)
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		//else if
		int d=55,e=55;
		if(d>e)
		{
			System.out.println("Test Passed");
		}
		else if(d==e)
		{
			System.out.println("D equals to E");
		}
		else
		{
			System.out.println("Test Failed");
		}
	}

}
