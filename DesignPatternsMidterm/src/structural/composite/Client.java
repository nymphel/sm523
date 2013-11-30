package structural.composite;

public class Client {

	public static void main(String[] args) {
		Widget canvas = new DrawingCanvas();
		Widget shape = new Shape();
		Picture picture = new Picture();
		Widget innerCanvas = new DrawingCanvas();
		Widget text = new Text();
		
		innerCanvas.addChild(text);
		innerCanvas.addChild(shape);
		
		canvas.addChild(shape);
		canvas.addChild(picture);
		canvas.addChild(innerCanvas);
		canvas.addChild(text);
		
		canvas.display();

	}

}
