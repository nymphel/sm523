package tr.edu.metu.ii.sm.dp.board;

//Concrete Command
public class MoveForwardCommand implements Command {
	
	private Icon icon;
	private int steps;
	
	public MoveForwardCommand(Icon icon, int steps) {
		this.icon = icon;
		this.steps = steps;
	}

	@Override
	public void execute() {
		int location = icon.getLocation();
		location += steps;
		
		icon.setLocation(location);
		
		System.out.println("MoveForwardCommand is executed...");
		icon.printLocation();

	}

}
