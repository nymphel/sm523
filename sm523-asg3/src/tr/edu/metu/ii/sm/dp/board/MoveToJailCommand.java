package tr.edu.metu.ii.sm.dp.board;

//Concrete Command
public class MoveToJailCommand implements Command {
	
	private static final int JAIL_LOCATION = 9;

	private Icon icon;
	
	public MoveToJailCommand(Icon icon) {
		this.icon = icon;
	}

	@Override
	public void execute() {
		icon.setLocation(JAIL_LOCATION);
		
		System.out.println("MoveToJailCommand is executed...");
		icon.printLocation();

	}

}
