package creational.abstractfactory;

import creational.abstractfactory.product.AndroidButton;
import creational.abstractfactory.product.AndroidMenu;
import creational.abstractfactory.product.AndroidWindow;
import creational.abstractfactory.product.Button;
import creational.abstractfactory.product.Menu;
import creational.abstractfactory.product.Window;

public class AndroidWidgetFactory implements AbstractWidgetFactory {

	@Override
	public Window createWindow() {
		return new AndroidWindow();
	}

	@Override
	public Button createButton() {
		return new AndroidButton();
	}

	@Override
	public Menu createMenu() {
		return new AndroidMenu();
	}

}
