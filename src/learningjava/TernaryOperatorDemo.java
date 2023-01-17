package learningjava;

public class TernaryOperatorDemo {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		if (num1 > num2) 
			System.out.println("num1 smaller");
		 else 
			System.out.println("num2 greater");
		
		
		String result = (num1 > num2) ? "num1 smaller" : "num2 greater";
		System.out.println(result);
	

	}

}
