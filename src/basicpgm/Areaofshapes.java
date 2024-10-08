package basicpgm;

public class Areaofshapes {

	public static void main(String[] args) {
		Areaofshapes ar=new Areaofshapes();
		ar.circle();
		ar.square(10);
		ar.rect(20, 15);
		System.out.println("Area of triangle:"+ar.tria());
	}
	public void circle()
	{
		int r=7;
		double ca=3.14*r*r;
		System.out.println("Area of circle: "+ca);
	}
	public void square(int a)
	{
		int as=a*a;
		System.out.println("Area of square: "+as);
	}
	public int rect(int l,int b)
	{
		int rect=l*b;
		System.out.println("Area of rectangle:"+rect);
		return rect;
	}
	public double tria()
	{
		int b=10,h=5;
		double tri=0.5*b*h;
		return tri;
	}

}
