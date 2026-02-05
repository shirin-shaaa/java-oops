import java.util.*;
class shape{
	//function overloader ->(same function name but different arguments)
	public void area(float radius){
	  double area = Math.PI* radius * radius;
	  System.out.println("Area of circle is: "+area);
	}
	public void area(int side){
	 int area = side * side;
	 System.out.println("Area of Squre is: "+area);
	}
	public void area(int length,int breadth){
	 int area = length * breadth;
	 System.out.println("Area of rectangle is: "+area);
	}
}

class area{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		shape sh = new shape();
		System.out.println("1.Circle");
		System.out.println("2.Square");
		System.out.println("3.Rectangle");
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		switch(choice){
			case 1:
			System.out.println("Enter your radius: ");
			float r = sc.nextFloat();
			sh.area(r);
			break;

			case 2:
			System.out.println("Enter the sides: ");
			int side = sc.nextInt();
			sh.area(side);
			break;

			case 3:
			System.out.println("Enter the Length: ");
			int len = sc.nextInt();
			System.out.println("Enter the Breadth: ");
			int bre = sc.nextInt();
			sh.area(len,bre);
			break;

			default:
			System.out.println("Invalid Choice");
		}
	}
}
