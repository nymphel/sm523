package creational.abstractfactory;

import creational.abstractfactory.product.Button;
import creational.abstractfactory.product.IphoneButton;
import creational.abstractfactory.product.IphoneMenu;
import creational.abstractfactory.product.IphoneWindow;
import creational.abstractfactory.product.Menu;
import creational.abstractfactory.product.Window;

public class IphoneWidgetFactory implements AbstractWidgetFactory {

	@Override
	public Window createWindow() {
		return new IphoneWindow();
	}
	
	@Override
	public Button createButton() {
		return new IphoneButton();
	}

	@Override
	public Menu createMenu() {
		return new IphoneMenu();
	}

}
