

import java.util.Scanner;

public class DoubleTrouble 
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		int res=doubleTheNumber( num);
		System.out.println(res);
	}
public static int doubleTheNumber(int num)
{
	int num1=num*2;
	return num1;
}
}
