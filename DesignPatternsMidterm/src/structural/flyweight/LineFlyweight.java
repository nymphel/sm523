package structural.flyweight;

import java.awt.Color;
import java.awt.Point;

//Flyweight
public interface LineFlyweight {
	public Color getColor();

	public void draw(Point location);
}
