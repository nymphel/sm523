package tr.edu.metu.ii.sm.dp.board;

//Concrete Command
public class MoveForwardCommand implements Command {
	
	private Icon icon;
	private int steps;
	private int previousLocation;
	
	public MoveForwardCommand(Icon icon, int steps) {
		this.icon = icon;
		this.steps = steps;
	}

	@Override
	public void execute() {
		previousLocation = icon.getLocation();
		
		int location = icon.getLocation();
		location += steps;
		
		icon.setLocation(location);
		
		System.out.println("MoveForwardCommand is executed...");
		icon.printLocation();

	}

	@Override
	public void undo() {
		icon.setLocation(previousLocation);
		System.out.println("MoveForwardCommand is undone...");
		icon.printLocation();
	}

}
