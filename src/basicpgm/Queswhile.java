package basicpgm;

public class Queswhile {

	public static void main(String[] args) {
		int count=0,a=12345;
		while(a!=0)
		{
			a=a/10;
			count++;	
		}
		System.out.print("count="+count);
	}

}
