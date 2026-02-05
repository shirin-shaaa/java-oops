import java.util.*;
class employee{
	int eno;
	String ename;
	double esalary;

	employee(int e_number , String e_name , double e_salary){
		this.eno = e_number;
		this.ename = e_name;
		this.esalary = e_salary;
	}	
}

class emp{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of employee: ");
		int size = sc.nextInt();
		int index;
		employee[] emps = new employee[size];
		for(index = 0;index<size; index++){
			System.out.println("Enter the employee code: ");
			int code= sc.nextInt();
			System.out.println("Enter the employee name: ");
			String name = sc.next();
			System.out.println("Enter the employee salary: ");
			double salary = sc.nextDouble();
			emps[index]  = new employee(code,name,salary);
		}
		System.out.println("Enter the employee code to search: ");
		int num = sc.nextInt();
		for(index = 0;index<size;index++){
			if(emps[index].eno == num){
				System.out.println("employee no: "+emps[index].eno+" Employee name: "+emps[index].ename+" Employee Salary: "+emps[index].esalary);
			}
		}
	}
}
