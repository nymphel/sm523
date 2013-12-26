package behavioral.command;

//Client
public class Client {
	public static void main(String[] args) {
		
		//receiver
		Light light = new Light();

		//invoker
		RemoteControl control = new RemoteControl();

		Command lightsOn = new LightOnCommand(light);
		Command lightsOff = new LightOffCommand(light);

		// switch on
		control.setCommand(lightsOn);
		control.pressButton();

		// switch off
		control.setCommand(lightsOff);
		control.pressButton();

	}

}