package structural.decorator;

public class Client {

	public static void main(String[] args) {
		ExternalEmailDecorator external = new ExternalEmailDecorator(new Email("lala"));
		external.getContents();

	}


}
