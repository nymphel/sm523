package structural.flyweight;

import java.awt.Color;
import java.awt.Point;

public class Client {

	public static void main(String[] args) {
		LineFlyweightFactory factory = new LineFlyweightFactory(); 
		LineFlyweight line = factory.getLine(Color.RED); 
		LineFlyweight line2 = factory.getLine(Color.RED); 

		//can use the lines independently
		line.draw(new Point(100, 100));
		line2.draw(new Point(200, 100));

	}

}
