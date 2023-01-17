package learningjava;

public class MultiDimeArray {

	public static void main(String[] args) {
		int [] myintarray = new int [10];
		myintarray [0]=10;
		myintarray [1]=20;
		myintarray [2]=30;
		myintarray [3]=40;
		System.out.println(myintarray [0]);
		
     int [] myarray = {10,20,30,40};   //first one and second one is same array writing in two different way 
		System.out.println(myarray[2]);
		
		for (int i=0; i<myintarray.length;i++)
		{
			System.out.println(myarray[i]); 
			
			//this is single dimension array
		}
	}

}
