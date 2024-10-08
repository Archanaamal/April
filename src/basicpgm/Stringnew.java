package basicpgm;

public class Stringnew {

	public static void main(String[] args) {
		String s="Hello";
		String s1=" World";
		String s2="hello";
		String s3="hello";
		String s4="Hello World";
		
		//concatenate
		
		System.out.println(s.concat(s1));
		System.out.println(s+s1+s2);
		
		//equals
		
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s2.equals(s3));
		
		//contains
		
		System.out.println(s4.contains(s));
		System.out.println(s4.contains(s3));
		
		//toUppercase
		
		System.out.println(s4.toUpperCase());
		
		//toLowercase
		
		System.out.println(s4.toLowerCase());
		
		//start with--s as string here
		
		System.out.println(s4.startsWith(s));
		// as letter should enter in double quarts
		System.out.println(s4.startsWith("H"));
		
		//end with
		
		System.out.println(s4.endsWith(s));
		
		//charAt--value at the 1st position displayed
		
		System.out.println(s4.charAt(1));
		
		//length
		
		System.out.println(s.length());
		System.out.println(s1.length()); //space is included in length
		
		//trim
		
		System.out.println(s1.trim());
		
		//FOREACH
		
		int ar[]= {1,2,3,4,5};
		for(int p:ar)
		{
			System.out.println(p);
		}
		
		char arr[]= {'a','c','@'};
		for(char q:arr)
		{
			System.out.println(q);
		}
		
		//toCharArray
		
		char z[]=s.toCharArray();
		for(char v:z)
		{
			System.out.println(v);
		}
		
		//split
		String n[]=s.split("l");
		for(String x:n) 
		{
			System.out.println(x);
			
		}
	}

}
