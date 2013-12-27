package tr.edu.metu.ii.sm.dp.board;

//Concrete Command
public class MoveToBeginningCommand implements Command {

	private static final int STARTING_LOCATION = 0;
	
	private Icon icon;
	
	public MoveToBeginningCommand(Icon icon) {
		this.icon = icon;
	}

	@Override
	public void execute() {
		icon.setLocation(STARTING_LOCATION);

	}

}
