package learningjava;

public class Operators {

	public static void main(String[] args) {
		int number =10;
		int numberTwo =20;
		
	//	number++;
		//number--;
		
		boolean bool=true;
		boolean bool1=!true;
		if(number==numberTwo)
		{
			System.out.println("numbers are not equal");
		}
		else {
			System.out.println("numbers are equal");
			
		}
	
		
		if ((number==10)&&(numberTwo==20))
		{
			System.out.println("Conditional operator");
		}
		String str= "Sar";
		System.out.println(bool);
		System.out.println(bool1);
		System.out.println(number+numberTwo);
		System.out.println(number+str);
				

	}

}
