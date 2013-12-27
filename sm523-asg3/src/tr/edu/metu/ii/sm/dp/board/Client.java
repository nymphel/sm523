package tr.edu.metu.ii.sm.dp.board;

import java.util.Random;

/** client */
public class Client {

	public static void main(String[] args) {
		Player player = new Player();
		Icon icon = new Icon();
		
		playerMoves(icon);
		
		Command command = new MoveForwardCommand(icon, 2);
		player.setCommand(command);
		player.performActionWrittenOnCard();
		
		
		playerMoves(icon);
		
		command = new MoveToBeginningCommand(icon);
		player.setCommand(command);
		player.performActionWrittenOnCard();
		
		
		playerMoves(icon);
		
		playerMoves(icon);
		
		playerMoves(icon);
		
		
		command = new MoveToJailCommand(icon);
		player.setCommand(command);
		player.performActionWrittenOnCard();
		
		command.undo();
		
		playerMoves(icon);
		
		command = new MoveForwardCommand(icon, 2);
		player.setCommand(command);
		player.performActionWrittenOnCard();
		
		
		
	}

	private static void playerMoves(Icon icon) {
		Integer[] diceValues = {1,2,3,4,5,6};
		int idx = new Random().nextInt(diceValues.length);
		int roll = (diceValues[idx]);
		
		int location = icon.getLocation();
		location+= roll;
		icon.setLocation(location);
		
		System.out.println("Player moves by rolling dice: "+roll);
		icon.printLocation();
	}

}
