import java.util.Scanner;

public class UserInputJaggedArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[][]=new int [scan.nextInt()][];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the 2D Length  for 1 Dimension");
			arr[i]=new int [scan.nextInt()];
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				arr[i][j]=scan.nextInt();	
				}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println(" ");
			}
			System.out.println(" ");
			}
		}
