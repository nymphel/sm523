package structural.flyweight;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

//Flyweight factory
public class LineFlyweightFactory {
	private List<LineFlyweight> pool;

	public LineFlyweightFactory() {
		pool = new ArrayList<LineFlyweight>();
	}

	public LineFlyweight getLine(Color c) {
		// check if we've already created a line with this color
		for (LineFlyweight line : pool) {
			if (line.getColor().equals(c)) {
				System.out.println("returned existing line");
				return line;
			}
		}
		// if not, create one and save it to the pool
		LineFlyweight line = new Line(c);
		pool.add(line);
		System.out.println("new line is created and added to pool");
		return line;
	}

}
