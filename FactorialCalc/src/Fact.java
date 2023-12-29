import java.util.Scanner;

public class Fact {
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=scan.nextInt();
	calculateFactorial(n);
}
public static void calculateFactorial(int n)
{
	 
	 int i=1;
	 int fact=1;
	 while(i<=n)
	 {
		 fact=fact*i;
	 i++;
	 }
	 System.out.println("Factorial of the Number :"+fact);
}
}
