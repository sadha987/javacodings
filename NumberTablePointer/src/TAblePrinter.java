import java.util.Scanner;

public class TAblePrinter {
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	printTable(num);
}
public static void printTable(int num)
{
	for(int i=1;i<=10;i++)
	{
				System.out.println(num + "*" +i + "="+num*i);
	}
	
}
}
