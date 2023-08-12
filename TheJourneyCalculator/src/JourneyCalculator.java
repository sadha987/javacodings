import java.util.Scanner;

public class JourneyCalculator 
{
public static void main(String args[])
{
 	Scanner scan =new Scanner(System.in);
 	System.out.println("Enter the speed and time");
 	double speed=scan.nextDouble();
	double time=scan.nextDouble();
	journeycalc jc=new journeycalc();
	double res=jc.calculateDistance( speed, time);
	System.out.println(res);
}

}
