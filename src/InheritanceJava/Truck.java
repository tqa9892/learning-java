package InheritanceJava;
                            //when you have subclass in a class by using extends command 
public class Truck extends VehicleCommon{ //this example of single inheritance where VehicleCommon is parents 
                                          //and class Truck is child of VehicleCommon
	public static void main(String[] args) {
		Truck tk = new Truck ();
		tk.vehiclestart();
		tk.vehiclestop();
		
	}	
	public void loadedtruck ()
	{
		System.out.println("truck carring load");
	}

	}


