package tr.edu.metu.ii.sm.dp.shopping;

/** concrete observer */
public class DirectorOfSales implements Observer {

	@Override
	public void update() {
		System.out.println("DirectorOfSales is updated...");
		System.out.println("Email is sent to DirectorOfSales with sales stats.");

	}

}
