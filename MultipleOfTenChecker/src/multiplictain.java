import java.util.Scanner;

public class multiplictain {
public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	
	int n=scan.nextInt();
	checkMultipleOfTen( n);
	
}

public static void checkMultipleOfTen(int n)
{
 if(n%10==0)
 {
 
 System.out.println( n+"Divisible by 10");
 }
 else
 {
	 System.out.println(n +  " is not divisble by 10");
 }
}

}
