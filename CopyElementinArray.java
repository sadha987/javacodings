import java.util.Scanner;

public class CopyElementinArray {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int arr[]=new int [scan.nextInt()];
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=scan.nextInt();
	}
	System.out.println("Array 1 Elements");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+" || ");
	}
int arr2[]=new int [arr.length];
int j=arr2.length-1;
for(int i=0;i<=arr.length-1;i++)
{
	arr2[j]=arr[i];
	j--;
}
System.out.println(" ");
System.out.println("Array 2 Elements");
for(int i=0;i<=arr2.length-1;i++)
{
	System.out.print(arr2[i]+" || ");
}
}
}
