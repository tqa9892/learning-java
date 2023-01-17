package InheritanceJava;

public class Car extends VehicleCommon { // example of hierarchical inheritance where this Class Car and other class
	// Truck are the child of VehicleCommon . In hierarchical inheritance you can't
	// make sub child of Car and Truck

	public static void main(String[] args) {

		Car cr = new Car();

		cr.vehiclestart();
		cr.vehiclestop();
		

	}

}
