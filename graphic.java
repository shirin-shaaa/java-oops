package graphics;
import java.util.*;
interface shape{
	double area();
}
class rectangle implements shape{
	Scanner sc=new Scanner(System.in);
	public double area()
	{
		System.out.println("enter the length and breadth: ");
		float l=sc.nextFloat();
		float b=sc.nextFloat();
		float area=l*b;
		return area;

	}
}
class square implements shape{
	Scanner sc=new Scanner(System.in);
	public double area()
	{
		System.out.println("enter the side length: ");
		float s=sc.nextFloat();
		float area=s*s;
		return area;
	}
}
class circle implements shape{
	Scanner sc=new Scanner(System.in);
	public double area()
	{
		System.out.println("enter radius:");
		float r=sc.nextFloat();
		float area= r*r*22/7;
		return area;
	}
}
class triangle implements shape{
	Scanner sc=new Scanner(System.in);
	public double area()
	{

		System.out.println("enter height and breadth: ");
		float h=sc.nextFloat();
		float a=sc.nextFloat();
		float area=a*h/2;
		return area;

	}
}
class graphic
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter choice: \n 1.rectangle \n 2. square \n 3.circle \n 4.triangle");
		int c=sc.nextInt();
		switch(c)
		{
		case 1:
			rectangle re=new rectangle();
			System.out.println("area of rectangle: "+re.area());
			break;
		case 2:
			square sq=new square();
			System.out.println("area of square: "+sq.area());
			break;
		case 3:
			circle cr=new circle();
			System.out.println("area of circle: "+cr.area());
			break;
		case 4:
			triangle tr=new triangle();
			System.out.println("area of triangle: "+tr.area());
			break;
		default:
			System.out.println("invalid choice!\n try again later.");
		}

     }
}
