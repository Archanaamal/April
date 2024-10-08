package oopinjava;

class School
{
	public void name()
	{
		System.out.println("GUPS");
	}
	public void place()
	{
		System.out.println("Kozhikode");
	}
}
class Teacher extends School
{
	public void subject()
	{
		System.out.println("subjects");
	}
	public void num()
	{
		System.out.println("num of teachers");
	}
}
class Studend extends Teacher
{
	public void div()
	{
		System.out.println("div");
	}
	
}

public class MultilevelInheritancee {

	public static void main(String[] args) {
		Studend stu=new Studend();
		stu.name();
		stu.place();
		stu.subject();
		stu.num();
		stu.div();
		
				

	}

}
