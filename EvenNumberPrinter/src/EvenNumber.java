import java.util.Scanner;

public class EvenNumber {
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	System.out.println();
	int n=scan.nextInt();
	printEvenNumber(n);
}
public static void printEvenNumber(int n)
{
	for( n=1;n<=10;n++)
	{
		if(n%2==0)
		{
			System.out.println(n);
		}
	}
}
}
