package learningjavaTestEx;

public class IncapsulationGetterSetterMethod {
	
	private int lenght; //it is not possible to manipulate data directly by other class so we have 
	private int weigth; // to create a method to the same particular class to manipulate the data 
	private int height ; // to make it usable for other class even though data type is private that method is 
	                    //called getter& setter method also known for incapsulation
	                    // by using incapsulation class can be access to other package.
	public void setbox (int l, int w, int h)
	{ 
		if (l>=1&& w>=1 && h>=1 ) {
		System.out.println("set the dimention "+l+" "+w+"  "+h+"");
		}
		else {
			System.out.println("set dimention error"); //if else statement is used here to make sure data 
		}                                             // data is logicable otherwise we can put any value to 
	}                                                // to the other class 
	public int setLength (int l) {
		if (l>=1) 
		{
		lenght =l;
		}
		else {
			System.out.println("error");
		}
		return lenght;
		
	}
	public int setWeight (int w) {//setter and getter method is used to manipulate data or method in the same class
		if (w>=1)                  // and make it usable or reusable for other class
		{
		weigth =w;
		}
		else {
			System.out.println("error");
		}
		return weigth;
	}
	public int setheight (int h) {
		if (h>=1) {
		height =h ;
		}
		else {
			System.out.println("error");
		}
		return height;
	}
	
	public int getLength () {
		
		return lenght;
		
	}
	public int getWeight () {
		
		return weigth;
	}
	public int getheight () {
		
		return height;
	}

}
