package basicpgm;

import java.util.Scanner;

public class Stringques {

	public static void main(String[] args) {
		String s="java";
		String s1=" language";
		String s2="java language is platform independent";
		String s3="platform";
		
		System.out.println(s.concat(s1));
		
		if(s2.contains(s3))
		{
		 System.out.println("pass");
		}
		
		//3
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String newstring=sc.nextLine();
		int count=0;
		for(int i=0;i<newstring.length();i++)
		{
			if(newstring.charAt(i)=='a' || newstring.charAt(i)=='e'  || newstring.charAt(i)=='i'  || newstring.charAt(i)=='o'  || newstring.charAt(i)=='u' 
			|| newstring.charAt(i)=='A' || newstring.charAt(i)=='E' || newstring.charAt(i)=='I' || newstring.charAt(i)=='O' || newstring.charAt(i)=='U' )
			{
				count++;
				
			}
		}
		System.out.println("Number of vowels:"+count);
		
		//4
		System.out.println("Alphabets");
		for(char i='A';i<='Z';i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		//4
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		int cc=0;
		char ch[]=str.toCharArray();
		for(char c:ch)
		{
			System.out.println(c);
			cc++;
		}
		System.out.println("Count of charachters:"+cc);
		
		//4
		System.out.println("enter the string:");
		String st=sc.nextLine();
		System.out.println("count of charachters:"+st.length());
		

	}

}
