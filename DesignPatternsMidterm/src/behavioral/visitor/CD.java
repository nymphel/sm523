package behavioral.visitor;

public class CD implements Visitable {
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
