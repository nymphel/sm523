package structural.composite;

public interface Widget {
	
	public void display();
	public void addChild(Widget widget);
	public void removeChild(Widget widget);
	public Widget getChild(int i);

}
