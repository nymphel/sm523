package tr.edu.metu.ii.sm.dp.shopping;

/** concrete observer */
public class DirectorOfMarketing implements Observer {

	@Override
	public void update() {
		System.out.println("DirectorOfMarketing is updated...");
		System.out.println("Email is sent to DirectorOfMarketing with marketing stats.");

	}

}
