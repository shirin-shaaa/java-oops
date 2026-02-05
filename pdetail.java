import java.io.*;
import java.util.*;

class person{
	String name;
	String gender;
	String address;
	int age;
	person(String name,String gender, String address,int age){
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.age = age;
	}
}

class employee extends person{
	int empid;
	String companyname;
	String qualification;
	int salary;
	employee(String name,String gender,String address, int age,int empid,String companyname,String qualification,int salary){
		super(name,gender,address,age);
		this.empid = empid;
		this.companyname = companyname;
		this.qualification = qualification;
		this.salary = salary;
	}
}

class teacher extends employee{
	String subject;
	String department;
	int teacherid;
	teacher(String name,String gender,String address,int age,int empid,String companyname,String qualification,int salary,String subject,String depatrment,int teacherid){
		super(name,gender,address,age,empid,companyname,qualification,salary);
		this.subject = subject;
		this.department = department;
		this.teacherid = teacherid;
	}

	void display(){
		System.out.println("Teacher details");
		System.out.println("==============================");
		System.out.println("EmpId : "+empid);
		System.out.println("College Name : "+companyname);
		System.out.println("qualification: "+qualification);
		System.out.println("Salary: "+salary);
		System.out.println("Teacher id: "+teacherid);
		System.out.println("Subject: "+subject);
		System.out.println("Department: "+department);
		System.out.println("Teacher id: "+teacherid);
		System.out.println("==============================");
	}
}

class pdetail{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int size,i;
		System.out.println("Enter the number of teacher: ");
		size = sc.nextInt();
		teacher [] tc = new teacher[size];
		for(i = 0;i<size;i++){
			System.out.println("==============================");
			System.out.println("Enter"+(i+1)+"teacher details");
			System.out.println("Enter name: ");
			String name = sc.next();
			System.out.println("Enter gender: ");
			String gender = sc.next();
			System.out.println("Enter address: ");
			String address = sc.next();
			System.out.println("Enter age: ");
			int age = sc.nextInt();
			System.out.println("Enter employee id: ");
			int empid = sc.nextInt();
			System.out.println("Enter college name: ");
			String companyname = sc.next();
			System.out.println("Enter qualification: ");
			String qualification = sc.next();
			System.out.println("Enter Salary: ");
			int salary = sc.nextInt();
			System.out.println("Enter subject: ");
			String subject = sc.next();
			System.out.println("Enter department: ");
			String department = sc.next();
			System.out.println("Enter teacher id: ");
			int teacherid = sc.nextInt();
			tc[i] = new teacher(name,gender,address,age,empid,companyname,qualification,salary,subject,department,teacherid);
		}
		for(i=0;i<size;i++){
			tc[i].display();
		}
		sc.close();
	}
}
