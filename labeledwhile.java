package loopcc;

public class labeledwhile {
public static void main(String args[])
{
	
	int i=1;
	System.out.println("welcome");
	// if we dont use the name which is given to while loop we can remove it its is called refactoring
	sadha: while(i<=5)
	{
		
		int j=1;	
		shanumgam:while(j<=5)
		{
		System.out.println("kodnest");
		j++;
		break shanumgam;
	}
		i++;
}
}
}
