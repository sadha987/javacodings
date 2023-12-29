import java.util.Scanner;

public class MergeArray {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int arr[]=new int[scan.nextInt()];
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=scan.nextInt();
		
	}
	int arr2[]=new int [arr.length];
	for(int i=0;i<=arr.length-1;i++)
	{
		arr2[i]=scan.nextInt();
		
	}
	int arr3[]=new int [arr.length+arr2.length];
	int j=0;
	for(int i=0;i<=arr.length-1;i++)
	{
		arr3[j]=arr[i];
		j++;
	}
	for(int i=0;i<=arr2.length-1;i++)
	{
		arr3[j]=arr2[i];
		j++;
	}
	System.out.println("Array 1 Elements are :");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+" ||");
		
	}
	System.out.println("Array 2 Elements are :");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr2[i]+" ||");
		
	}
	System.out.println("Array 3 Elements are :");
	for(int i=0;i<=arr3.length-1;i++)
	{
		System.out.print(arr3[i]+" ||");
		
	}
}
}
