package learningjavaTestEx;

public class LinkWithGetterSetter {

	public static void main(String[] args) {
	
		IncapsulationGetterSetterMethod gs = new IncapsulationGetterSetterMethod ();
		//int l=gs.lenght=10;
		//int w=gs.weigth =20;
		//int h=gs.height =30;
		
		int l = gs.setLength (0); //Value has to be 1>= coz of the logic is setup from the source data or method
		int w = gs.setWeight(25);
		int h = gs.setheight(35);
		
		
		gs.setbox(l, w, h);
System.out.println(gs.getLength());
	}

}
