package creational.abstractfactory;

import creational.abstractfactory.product.Button;
import creational.abstractfactory.product.Menu;
import creational.abstractfactory.product.Window;

public interface AbstractWidgetFactory {
	
	public Window createWindow();
	public Button createButton();
	public Menu createMenu();

}
