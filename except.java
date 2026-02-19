import java.io.*;
import java.util.*;
class userException extends Exception
{
	public userException(String s)
	{
		super(s);
	}
}
class except
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String uname,pass;
		try 
		{
			System.out.println("enter username:");
            uname=sc.nextLine();
            if(uname=="")
            {
            	throw new userException("No user name....");
            }
            if(uname.length()<8)
            {
            	throw new userException("greater than 8 characters...");
            }
		}
		catch(userException e)
		{
			System.out.println("username error");
		}
		try{
            System.out.println("enter password");
            pass=sc.nextLine();
            if(pass=="")
            {
            	throw new userException("invalid password!!!");
            }
            if(pass.length()>8)
            {
               throw new userException("password shouldn't be greater than 8 characteristics!!!");	
            }
		}
		catch(userException es)
		{
			System.out.println("password error");
		}
	}
}