import java.util.Scanner;

public class operations {
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	System.out.println(subtractnumbers(num1, num2));
	
	 
	System.out.println(multiplynumbersnumbers( num1, num2));
	
	System.out.println(divideNumbers( num1, num2));
	
	System.out.println(findremainder( num1, num2));
	
}

public static int subtractnumbers(int num1,int num2)
{
	return num1-num2;
}
public static int multiplynumbersnumbers(int num1,int num2)
{
	return num1*num2;
}
public static double divideNumbers(int num1,int num2)
{
	return num1/num2;
}
public static int findremainder(int num1,int num2)
{
	return num1%num2;
}


}