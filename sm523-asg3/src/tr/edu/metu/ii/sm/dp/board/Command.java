package tr.edu.metu.ii.sm.dp.board;

/** command */
public abstract class Command {
	
	protected Icon icon;
	
	public abstract void execute();
	public abstract void undo();
	
}
