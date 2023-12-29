import java.util.Scanner;

public class Tc {
public static void mian(String args[])
{
	Scanner scan =new Scanner(System.in);
	System.out.println(" Enter the celsius and Fahrenheit");
	double c=scan.nextDouble();
	double f=scan.nextDouble();
	scan.close();
	tc2 tc=new tc2();
	System.out.println(tc.celsiusToFahrenheit(c));
	System.out.println(tc.FahrenheitToCelsius(f));
}

}
