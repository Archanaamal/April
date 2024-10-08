package oopinjava;


class Flower
{
	public void clr() 
	{
		System.out.println("red");
	}
	public void sml()
	{
		System.out.println("good");
	}
}
class Rose extends Flower
{
	public void shp()
	{
		System.out.println("round");
	}
}

public class Inheretancee {

	public static void main(String[] args) {
	 Rose rs=new Rose();
	 rs.clr();
	 rs.sml();
	 rs.shp();
	 


	}

}
