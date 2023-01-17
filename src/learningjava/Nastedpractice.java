package learningjava;

public class Nastedpractice {

	public static void main(String[] args) {
		int count=0;
		for ( int i=1; i<=5; i++)
		{
			int j=1;
			while (j<=3) {
				for (int k=1; k<=2; k++) {
					System.out.println(""+i+"  "+j+ "  "+k);
					count++; // count suppose to be in most inner loop to count number of execution
				}
				j++;
			}
			System.out.println(count);
		}

	}

}
