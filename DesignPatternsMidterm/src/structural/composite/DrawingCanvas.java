package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class DrawingCanvas implements Widget {
	
	private List<Widget> children = new ArrayList<>();

	@Override
	public void display() {
		System.out.println("displaying a drawing canvas");
		for (Widget widget : children) {
			widget.display();
			
		}

	}

	@Override
	public void addChild(Widget widget) {
		children.add(widget);
	}

	@Override
	public void removeChild(Widget widget) {
		children.remove(widget);

	}

	@Override
	public Widget getChild(int i) {
		return children.get(i);
	}


}
