package tr.edu.metu.ii.sm.dp.board;

public class Client {

	public static void main(String[] args) {
		Player player = new Player();
		Icon icon = new Icon();
		
		Command command = new MoveToBeginningCommand(icon);
		player.setCommand(command);
		player.performActionWrittenOnCard();
		
		command = new MoveToJailCommand(icon);
		player.setCommand(command);
		player.performActionWrittenOnCard();
		
		command = new MoveForwardCommand(icon, 2);
		player.setCommand(command);
		player.performActionWrittenOnCard();
		
	}

}