package com.kodnest.training.methodoverloading;
import java.util.Scanner;

public class DisneyChai 
{

public static void main(String args[] )
{
	Scanner scan =new Scanner(System.in);
	
	System.out.println("enter your name" );
	String name=scan.nextLine();
	
	System.out.println("enter your  year of birth");
	int yob=scan.nextInt();
	greet(name);
int res=calc(yob);
System.out.println("you are" + " "+ res + " " +"years old");

}
public static void greet(String name)
{
	System.out.println(" Hello... " + name );
}
public static int calc(int yob)
{
	//System.out.println("you are" + " "+ yob + " " +"years old");
	return 2023-yob;
}
}
