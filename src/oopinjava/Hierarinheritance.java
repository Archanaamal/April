package oopinjava;

class Animal
{
	public void sleep()
	{
		System.out.print("sleep"+" ");
	}
	public void jump()
	{
		System.out.print("jump"+" ");
	}
}
class Monkey extends Animal
{
	public void bite()
	{
		System.out.print("bite"+" ");
	}
}
class Tiger extends Animal
{
	public void roar()
	{
		System.out.print("roar"+" ");
	}
}

public class Hierarinheritance {

	public static void main(String[] args) {
		Monkey mn=new Monkey();
		Tiger tr=new Tiger();
		System.out.println("Monkey");
		mn.bite();
		mn.sleep();
		mn.jump();
		System.out.println(" ");
		System.out.println("Tiger");
		tr.roar();
		tr.sleep();
		tr.jump();

	}

}
