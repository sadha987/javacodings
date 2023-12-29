import java.util.Scanner;

public class VendingMachine {
public static void main(String args[])
{
	Scanner scan=new  Scanner(System.in);
	String productCode=scan.next();
	getProduct(productCode);
	}
public static void getProduct(String productCode) {
	{
	switch(productCode)
	{
	case "P01":
		System.out.println("Coco cola");
		break;
	case "P02":
		System.out.println("pepsi");
		break;
	case "P03":
		System.out.println("Fanta");
		break;
	case "P04":
		System.out.println("jaljeera");
		break;
	case "p05":
		System.out.println("MountainDew");
		break;
	case"P06":
		System.out.println("Boatgauva");
		break;
		default:
			System.out.println("panaga");
	}
	
	}
}
}
