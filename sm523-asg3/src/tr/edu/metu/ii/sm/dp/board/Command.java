package tr.edu.metu.ii.sm.dp.board;

/** command */
public interface Command {
	
	public void execute();
	public void undo();
	
}
