package learningjava;

public class NastedLoopDemo {

	public static void main(String[] args) {
		int count =0;
	for (int i=1; i<=5; i++) {
			int j=1;
			while (j<=3) {

                         //	System.out.println(""+i+   ""+j ); to print two or more variable in
				         //one print that's the format
          
        	   
           for (int k=1; k<=2;k++)
           {
        	   System.out.println("value of i "+i+ " value of j "+j + " value of k "+k );
        	   count++;      //most inner loop execute first and then go second inner 1 execution again go
        	                 //to most inner and re execute full .check run result for understanding
           }
           j++;
           
           
			}
	}
	System.out.println(count);
	}
}
			

