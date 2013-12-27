package tr.edu.metu.ii.sm.dp.board;

/** concrete command */
public class MoveToJailCommand extends Command {
	
	private static final int JAIL_LOCATION = 33;
	
	private int previousLocation;
	
	public MoveToJailCommand(Icon icon) {
		this.icon = icon;
	}

	@Override
	public void execute() {
		previousLocation = icon.getLocation();
		
		icon.setLocation(JAIL_LOCATION);
		
		System.out.println("MoveToJailCommand is executed...");
		icon.printLocation();

	}

	@Override
	public void undo() {
		icon.setLocation(previousLocation);
		System.out.println("MoveToJailCommand is undone...");
		icon.printLocation();
	}

}
