package tr.edu.metu.ii.sm.dp.shopping;

public class SilverCustomer implements Observer {

	@Override
	public void update() {
		System.out.println("SilverCustomer is updated...");
		System.out.println("Plain email is sent to SilverCustomer to put him/her in a flurry!");
	}

}
