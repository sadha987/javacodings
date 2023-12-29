import java.util.Scanner;

public class disount {
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the input");
	double purchaseAmount=scan.nextDouble();
	checkDisount(purchaseAmount);
	
}
public static void checkDisount(double purchaseAmount)
{
	if(purchaseAmount>100)
	{
		System.out.println("purchase applicable");
	}
}

}
