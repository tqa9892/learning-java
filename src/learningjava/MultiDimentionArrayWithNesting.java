package learningjava;

public class MultiDimentionArrayWithNesting {

	public static void main(String[] args) {
		int [] [] multidimentionarray = new int [2] [3];
		
		multidimentionarray [0][0] = 2;
		multidimentionarray [0][1] = 3;
		multidimentionarray [0][2] = 4;
		multidimentionarray [1][0] = 6;
		multidimentionarray [1][1] = 7;
		multidimentionarray [1][2] = 8;
		System.out.println(multidimentionarray [1][0]);
		
       int [] [] multidimentionarra1 = {{2,3,4},{6,7,8}} ;
       
       System.out.println(multidimentionarra1 [1][0]); // two different way to express Multidimention array
    //ex nesting with array below
       for (int i=0; i<multidimentionarra1.length; i++) 
       {
    	   for (int j=0;j<multidimentionarra1[i].length;j++) {
    		   System.out.println(multidimentionarra1 [i] [j]);
    		   
    	   }
       }	
	}

}
