import java.util.Scanner;

public class greeting {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the name");
		String name=scan.next();		
        greetingmsg(name);
	}
public  static void greetingmsg(String name)
{
	System.out.println("Hello "+ name +".."+"how are you..");
}
}
