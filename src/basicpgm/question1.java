package basicpgm;

public class question1 {

	public static void main(String[] args) {
		int a=23,b=45;
		System.out.println(a==b);
		
		int c=55,d=70;
		System.out.println(c<50 && c<d);
		
		//int e=20,f=30,temp;
	   // temp=e;
	    //e=f;
	   // f=temp;
	    int f=30,e=20;
	    e=e+f-e;
	     f=e+f-f;
	    System.out.println("e="+e + "f="+f);
		
		int h=27;
		int i=h%10;
		System.out.println(i);
		
		

	}
;
}
