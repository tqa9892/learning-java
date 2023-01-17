package learningjava;

public class AddParameterDemo {

	public static void main(String[] args) {

		AddParameterDemo ad = new AddParameterDemo();
		System.out.println(ad.addparameter(7, 5));

		ad.diffparameter("this is string", 2, 3);
// == is used to compare two value either its equal or not and || this sign is or
	}

	public int addparameter(int x, int y) {
		 int z =(x + y);
		return z;
	}

	public void diffparameter(String s, int i, float f) {
		System.out.println(s);
		System.out.println(i);
		System.out.println(f);

	}
}
