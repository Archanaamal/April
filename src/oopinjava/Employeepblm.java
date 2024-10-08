package oopinjava;

class Member
{
	String name;
	int age;
	String phoneno;
	String address;
	int salary;
}
class Employee extends Member
{

	String name;

	public void memsp()
	{
		System.out.println("Member Specification:");
	}
}
class Manager extends Member
{
	public void dept()
	{
		System.out.println("Department:");
	}
}
public class Employeepblm {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.name="Archana";
		Manager mg=new Manager();
		System.out.println("Employee details");
		System.out.println(emp.name="Arun");
		System.out.println(emp.age="24");
		emp.phoneno();
		emp.address();
		emp.salary();
		emp.memsp();
		System.out.println("Manager details");
		//mg.name();
		mg.age();
		mg.phoneno();
		mg.address();
		mg.salary();
		mg.dept();

	}

}
