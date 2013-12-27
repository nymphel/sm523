package tr.edu.metu.ii.sm.dp.board;

//Invoker
public class Player {
	
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void performActionWrittenOnCard() {
		command.execute();
	}

}