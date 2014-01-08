package tr.edu.metu.ii.sm.dp.shopping;

/** concrete observer */
public class GoldenCustomer implements Observer {

	@Override
	public void update() {
		System.out.println("GoldenCustomer is updated...");
		System.out.println("Mail is sent to GoldenCustomer within a golden envelope...");
		
	}

}
