


package learningjava;

public class Ifelsedemo {

	public static void main(String[] args) {
	int number1=10;
	int number2=20;
	int number3=30;
	
	
	if (number1<number2)
	
	{
		System.out.println("1 is greater than 2");
		if (number3>number2)
		{ 
			System.out.println("3 greater");
		}
		else {System.out.println("2 greater");}

	}
	else if(number1==number2)
	{ System.out.println("equal");}
	
	else if(number1<number2) {
		System.out.println("2 is greather");
		}
	
	
	}
	

}