package tr.edu.metu.ii.sm.dp.board;

//Receiver
public class Icon {
	
	private int location;

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}
	
	public void printLocation() {
		System.out.println("icon location is: " + location);
	}
	
}