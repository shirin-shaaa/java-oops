import java.io.*;
import java.util.*;

class student{
	String name = "Jhon";
	String batch = "MCA";
}

class sport extends student{
	String sport = "Gunslinger";
}

class result extends sport{
	String result = "win";
	void display(){
		System.out.println("Student name: "+name);
		System.out.println("Student batch: "+batch);
		System.out.println("Student sport: "+sport);
		System.out.println("result: "+result);
	}
}

class sco{
	public static void main(String args []){
		result r = new result();
		r.display();
	}
}
