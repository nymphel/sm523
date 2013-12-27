package tr.edu.metu.ii.sm.dp.board;

//Concrete Command
public class MoveToBeginningCommand implements Command {

	private Icon icon;
	
	public MoveToBeginningCommand(Icon icon) {
		this.icon = icon;
	}

	@Override
	public void execute() {
		icon.setLocation(0);

	}

}
