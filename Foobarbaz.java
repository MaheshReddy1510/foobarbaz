import java.util.*;

public class foobarbaz {
	public static void main(String[] args) {
	
		int k;
		int x=0;
		try{
			System.out.println("Enter your number:");
			Scanner in=new Scanner(System.in);
		x=in.nextInt();

		}
		catch(Exception e){
			System.out.println("invalid input");
		}
		for(k=1;k<=x;k++)
		{
		if(k%3==0&& k%5==0 && k%7==0)
		{
			System.out.println("Foo Bar Baz");
		}
		else if(k%3==0&& k%5==0)
		{
			System.out.println("Foo Bar");
		}
		else if(k%3==0 && k%7==0)
		{
			System.out.println("Foo Baz");
		}
		else if(k%5==0 && k%7==0)
		{
			System.out.println("Bar Baz");
		}
		
		else if(k%3==0)
		{
			System.out.println("Foo");
		}
		
		else if(k%5==0)
		{
			System.out.println("Bar");
		}
		
		else if(k%7==0)
		{
			System.out.println("Baz");
		}
		else
		{
			System.out.println(k);
		}
		}
		
	}	

}