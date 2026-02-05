import java.io.*;
import java.util.*;

class publisher{
	String name = "jhon Marston";
}

class book extends publisher{
	String bookname = "Red Dead Redemption";
}

class literature extends book{
	String type = "literature";
}

class fiction extends book{
	String type = "Fiction";
}

class lib{
	public static void main(String [] args){
		literature lt = new literature();
		fiction fc  = new fiction();
		
		System.out.println("fiction book details");
		System.out.println("Publisher: "+fc.name+"\nname: "+fc.bookname+"\ntype: "+fc.type);
		System.out.println("======================");
		System.out.println("literature book details");
		System.out.println("Publisher: "+lt.name+"\nname: "+lt.bookname+"\ntype: "+lt.type);
	}
}
