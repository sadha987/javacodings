import java.util.Scanner;

public class countofEven {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int arr[]=new int[5];
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=scan.nextInt();
	}
	int Even=0;
	int odd=0;
	for(int i=0;i<5;i++)
	{
		if(arr[i]%2==0)
		{
			Even++;
		}
		else if(arr[i]%2!=0)
		{
			odd++;
		}
	}
	System.out.println("The count of Even number is "+ Even);
	System.out.println("The count of odd number is "+ odd);
}
}
