package InheritanceJava;

public class TeslaTruck extends Truck { // [this is example of multilevel inheritance where class Teslatruck is
	// the child (TeslaTruck is grand child of VehicleCommon) of Truck and also
	// truck is the child of VehicleCommon ]

	public static void main(String[] args) {

		TeslaTruck tt = new TeslaTruck();
		tt.loadedtruck(); // Inherited from truck
		tt.vehiclestart(); // Inherited from VehicleCommon
		tt.vehiclestop();
	}

}
