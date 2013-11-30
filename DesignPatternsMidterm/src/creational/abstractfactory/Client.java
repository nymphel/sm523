package creational.abstractfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
	

	private static final String ANDROID = "0";
	private static final String IPHONE = "1";

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter platform: (0=Android, 1=Iphone)");
        String input = br.readLine();
        
		AbstractWidgetFactory abstractWidgetFactory = null;

		if(ANDROID.equals(input)) {
			abstractWidgetFactory = new AndroidWidgetFactory();
		} else if(IPHONE.equals(input)) {
			abstractWidgetFactory = new IphoneWidgetFactory();
		} else {
			return;
		}
		
		abstractWidgetFactory.createButton().click();

	}

}
