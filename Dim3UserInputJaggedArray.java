import java.util.Scanner;

public class Dim3UserInputJaggedArray {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the length of the 1 dim");
	int arr[][][]=new int [scan.nextInt()][][];
	 for(int i=0;i<=arr.length-1;i++)
	 {
		 System.out.println("Enter the 2 dim length"+i);
		arr[i]=new int [scan.nextInt()] [];
	 }
	 for(int i=0;i<=arr.length-1;i++)
	 {
		 for(int j=0;j<=arr[i].length-1;j++)
		 {
			 System.out.println("Enter the Array 3 Length"+i+j);
		  arr[i][j]=new int [scan.nextInt()];
	 }
	 }
		 for(int i=0;i<=arr.length-1;i++)
			{
				for(int j=0;j<=arr[i].length-1;j++)
				{
					for(int k=0;k<=arr[i][j].length-1;k++)
					{
						System.out.println("Enter the array elements");
						arr[i][j][k]=scan.nextInt();
					}
					}
				}
		 
		 for(int i=0;i<=arr.length-1;i++)
			{
				for(int j=0;j<=arr[i].length-1;j++)
				{
					for(int k=0;k<=arr[i][j].length-1;k++)
					{
						System.out.print(arr[i][j][k]+" ");
					}
					System.out.println(" ");
					}
				System.out.println(" ");
				}
				{
					
				}
			}

	}
