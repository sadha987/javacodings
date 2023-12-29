import java.util.Scanner;

public class ArrayPuzzle {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int rows=scan.nextInt();
	int cols=scan.nextInt();
	int arr[][]=new int [rows][cols];
	for( rows=0;rows<=arr.length-1;rows++)
	{
		for( cols=0;cols<=arr[rows].length-1;cols++)
		{
			arr[rows][cols]=scan.nextInt();
		}
	}
	System.out.println("Aray Elements are");
	for( rows=0;rows<=arr.length-1;rows++)
	{
		for(cols=0;cols<=arr[rows].length-1;cols++)
		{
			System.out.print(arr[rows][cols]+" " );
		}
		System.out.println(" ");
	}
	System.out.println(" ");
	
	for(int k=0;k<=cols-1;k++)
	{
		System.out.print(arr[0][k]+" ");
	}
	System.out.println(" ");
	for(int k=0;k<=rows-1;k++)
	{
		System.out.print(arr[k][cols-1]+" ");
	}
	System.out.println(" ");
	for(int k=0;k<=rows-1;k++)
	{
		System.out.print(arr[k][0]+" ");
	}
	System.out.println(" ");
	for(int k=rows-1;k>=0;k--)
	{
		System.out.print(arr[k][cols-1]+" ");
	}
	System.out.println(" ");
	for(int k=rows-1;k>=0;k--)
	{
		System.out.print(arr[k][0]+" ");
	}
	System.out.println(" ");
	System.out.println(" ");
	for(int k=0;k<=cols-1;k++)
	{
		System.out.print(arr[0][k]+" ");
	}
	
	for(int k=1;k<=rows-1;k++)
	{
		System.out.print(arr[k][cols-1]+" ");
	}

	for(int k=cols-2;k>=0;k--)
	{
		System.out.print(arr[rows-1][k]+" ");
	}

	for(int k=rows-2;k>=1;k--)
	{
		System.out.print(arr[k][0]+" ");
	}
	for(int k=1;k<=cols-2;k++)
	{
		System.out.print(arr[1][k]+" ");
	}
	
}
}
