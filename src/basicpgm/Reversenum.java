package basicpgm;

public class Reversenum {

	public static void main(String[] args) {
		int a=123456,n,i,rev=0;
		for(i=1;i<=6;i++)
		{
			n=a%10;
			rev=rev*10+n;
			a=a/10;
			
		}
		System.out.println("Reverse of the number:"+rev);
		
		
		int reve=0,m=3426,s;
		while(m>0)
		{
			s=m%10;
			reve=reve*10+s;
			m=m/10;
			
			
		}
		System.out.println("Reverse of the number:"+reve);
	}

}
