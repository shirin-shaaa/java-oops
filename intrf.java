import java.io.*;
import java.util.*;
interface shape
{
	void area();
	void perimeter();
}
class circle implements shape
{
	int r;
	Scanner sc=new Scanner(System.in);
	public void area(){
	System.out.println("enter radius:");
	 r=sc.nextInt();
	double area=Math.PI*r*r;
	System.out.println("Area of circle:"+area);

	}
public void perimeter(){

	double perimeter=2*Math.PI*r;
	System.out.println("perimeter of the circle: "+perimeter);
}
}
class rectangle implements shape
{
	int l;
	int b;
	Scanner sc=new Scanner(System.in);
	public void area(){
		System.out.println("enter the length:");
		 l=sc.nextInt();
		System.out.println("enter the breadth:");
		 b=sc.nextInt();
		double area=l*b;
		System.out.println("area of rectangle:"+area);
	}
	public void perimeter(){
    
	double perimeter=2*(l+b);
	System.out.println("perimeter of rectangle="+perimeter);
	}
}
class intrf
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	circle fg=new circle();
	rectangle df=new rectangle();
	System.out.println("enter the choice: \n 1.circle \n 2.rectangle");
	int n=sc.nextInt();
switch(n)
{
case 1: fg.area();
	fg.perimeter();
	break;
case 2: df.area();
	df.perimeter();
	break;
default:System.out.println("invalid choice");

}
}
}