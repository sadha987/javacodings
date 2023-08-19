package cc;

import java.util.Scanner;

public class StudMark {
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your marks:");
	int marks=scan.nextInt();
	if(marks>35)
	{
		if(marks>=90)
		{
			System.out.println("your grade is A");
		}
		else if(marks>80)
		{
			System.out.println("your grade is b");
		}
		else if(marks>70)
		{
			System.out.println("your grade is C");
		}
		else if(marks>50)
		{
			System.out.println("your grade is d");
		}
		else if(marks<=40 )
		{
			System.out.println("your grade is E");
		}
	}
	else
	{
		System.out.println("Work Hard ");
	}
}
}
