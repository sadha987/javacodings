package calc;
import java.util.Scanner;

public class TaxCalculator 
{
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	System.out.println(" Enter the Purchase amt and Tax rate ");
	double purchaseamt=scan.nextDouble();
	double taxrate=scan.nextDouble();
	
	Taxcalc2 taxcalc2=new Taxcalc2();
	System.out.println(taxcalc2.calculateTotalWithTax(purchaseamt, taxrate));
	
	
}

	}


