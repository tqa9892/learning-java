package learningjava;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		/*
		 * switch(expression){
		 * case1 :
		 * statements
		 * case2 :
		 * statement
		 * 
		 * default :
		 * statements
		 * break statement use once condition fulfill than it will stop there and not execute further  
		 * }
		 * 
		 */
		
		int day=2;
		switch (day) {
		case 1 :
			System.out.println("monday");
			break ;
		case 2 :
			System.out.println("tuesday");
			break ;
		case 3 :
			System.out.println("wednesday");
			break ;
		case 4 :
			System.out.println("thursday");
			break ;
		case 5 :
			System.out.println("friday");
			break ;
	
		case 6 :
			System.out.println("saturday");
			break ;
		case 7 :
			System.out.println("sunday");
			break ;
			default :
				System.out.println("none");
		}

	}

}
