import java.util.Scanner;

public class AverageValueOfArray {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int arr[]=new int[5];
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=scan.nextInt();
		
	}
	int sum=0;
	for(int i=0;i<=arr.length-1;i++)
	{
		sum+=arr[i];
		
	}
	sum=sum/arr.length;
	System.out.println(sum + " ");
}
}
