import java.util.Scanner;

public class Polygon {
public static void main(String rgs[])
{
	Scanner sacn=new Scanner(System.in);
	
	int sides=sacn.nextInt();
	polygon(sides);
	}
public static void polygon(int sides)
{
	switch(sides)
	{

	
	case 1:
		System.out.println("polygon");
		break;
	case 2:
		
		System.out.println("Quadrilateral");
		break;
	case 3:
		
		System.out.println("Pentagon");
		break;
	case 4:
	
		System.out.println("hexagon");
		break;

	default :
		System.out.println("no shapes");
}
}
}