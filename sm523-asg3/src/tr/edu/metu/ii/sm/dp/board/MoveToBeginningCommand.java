package tr.edu.metu.ii.sm.dp.board;

/** concrete command */
public class MoveToBeginningCommand implements Command {

	private static final int STARTING_LOCATION = 0;
	
	private Icon icon;
	private int previousLocation;
	
	public MoveToBeginningCommand(Icon icon) {
		this.icon = icon;
	}

	@Override
	public void execute() {
		previousLocation = icon.getLocation();
		
		icon.setLocation(STARTING_LOCATION);
		
		System.out.println("MoveToBeginningCommand is executed...");
		icon.printLocation();

	}

	@Override
	public void undo() {
		icon.setLocation(previousLocation);
		System.out.println("MoveToBeginningCommand is undone...");
		icon.printLocation();
	}

}
