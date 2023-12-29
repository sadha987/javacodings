import java.util.Scanner;

public class CalculatorDilemma {
public static void main(String args[])
{
	int a,b,result;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number");
	 a=scan.nextInt();
	 b=scan.nextInt();
	System.out.println("Enter an operator: +,-,*,/");
	char op=scan.next().charAt(0);
	switch(op)
	{
	case'+':
		result=a+b;
		System.out.println(a + "+" + b +"=" +result);
	break;
	case'-':
		result=a-b;
		System.out.println(a + "-" + b +"=" +result);
	break;
	case'*':
		result=a*b;
		System.out.println(a + "*" + b +"=" +result);
	break;
	case'/':
		result=a/b;
		System.out.println(a + "/" + b +"=" +result);
	break;
	default:
	{
		System.out.println("invalid operator");
		break;
	}
	
	}
	}

}
