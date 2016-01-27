import java.util.*;
import java.io.*;
public class foobarbaz {
	public static void main(String[] args)
{
		PrintWriter writer=null;
		try{
			writer=new PrintWriter(new FileWriter("FooBarBaz.txt"));
		}
		catch(IOException e1){
			e1.printStackTrace();
		}
	  int y=0;
		
		while(true)
			{
				int k=0;
				String x;
			System.out.println("Enter your number:");
			Scanner sc=new Scanner(System.in);
			try
			{
				x=sc.next();
			
	
		        if(x.equals("stop"))
				{
			break;
		
				}
		else
		{
			y=Integer.parseInt(x);
		}
		}catch(Exception e){
			System.out.println("invalid input");
		}
		for(k=1;k<=y;k++)
		{
		if(k%3==0&& k%5==0 && k%7==0)
		{
			writer.println("Foo Bar Baz");
		}
		else if(k%3==0&& k%5==0)
		{
			writer.println("Foo Bar");
		}
		else if(k%3==0 && k%7==0)
		{
			writer.println("Foo Baz");
		}
		else if(k%5==0 && k%7==0)
		{
			writer.println("Bar Baz");
		}
		
		else if(k%3==0)
		{
			writer.println("Foo");
		}
		
		else if(k%5==0)
		{
			writer.println("Bar");
		}
		
		else if(k%7==0)
		{
			writer.println("Baz");
		}
		else
		{
			writer.println(k);
		}
		}
		
	}	
	 writer.close();
	}
}

		
