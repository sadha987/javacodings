import java.util.Scanner;

public class fibonaccino {
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	System.out.println();
	int n=scan.nextInt();
	printFibonaaciSeries(n);
}
public static void printFibonaaciSeries(int n)
{
int fib1=0;
int fib2=1;
if(n==1)
{
	System.out.println(fib1);
}
else if(n==2)
{
 System.out.println( fib1 + " "+fib2);
}
else
{
	System.out.println(fib1 +" " + fib2);
	for(int i=3;i<=n;i++)
	{
		int nextfib=fib1+fib2;
		System.out.println(" " +nextfib);
fib1=fib2;
fib2=nextfib;
	}
}
}
}