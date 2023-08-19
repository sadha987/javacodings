import java.util.Scanner;

public class Tempconv {
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter fahrenheit ");
	double F=scan.nextDouble();
	TempratureConverter temperatureConverter=new TempratureConverter();
	System.out.println(temperatureConverter.convertFahrenheitToCelsius(F));
	
	
}
}
