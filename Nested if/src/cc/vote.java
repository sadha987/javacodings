package cc;

import java.util.Scanner;

public class vote {
public static void main(String args[])
{
	Scanner scan= new Scanner (System.in);
	System.out.println("Enter your age:");
	int age=scan.nextInt();
	if(age>18) {
		if(age>=18)
	{
			System.out.println("you are eligible for voting");
			}
	}
	else
	{
		System.out.println("you are not eligible for voting");
	}
}
}