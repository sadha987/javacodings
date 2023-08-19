import java.util.Scanner;

public class CountNum {
public static void main (String args[])
{
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the number");
	int i=scan.nextInt();
	
	System.out.println(countsetbits( i));
	}
 static int countsetbits(int n)
{
	int count=0;
	while(n>0)
	{
		count +=n&1;
		n>>=1;
	}
	return count;
}
}
