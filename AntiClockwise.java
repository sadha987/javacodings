import java.util.Scanner;

public class AntiClockwise {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int arr[]=new int[scan.nextInt()];
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=scan.nextInt();
		
	}
	System.out.println("Before sorting");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+" || ");
		
	}
	int temp=arr[0];
	for(int i=1;i<=arr.length-1;i++)
	{
		arr[i-1]=arr[i];
	}
arr[arr.length-1]=temp;
	System.out.println(" sorting");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+" || ");
		
	}
}
}
