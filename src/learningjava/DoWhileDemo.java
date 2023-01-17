package learningjava;

public class DoWhileDemo {

	public static void main(String[] args) {
		int i=1;
		do { 
			System.out.println(i);
			i++;
			
		}
		while (i<=5);
		
System.out.println("dowhile exit");

/* on the other hand
 */


    
while (i<8) {
	System.out.println(i);
	i++;
}
System.out.println("while loop exit");

/*do while loop always print first condition than check while loop to continue or not 
 * other hand while loop always get into the loop and continue until condition allow and then exit
 */

	}

}
