package behavioral.visitor;

//Element interface
public interface Visitable {
	public void accept(Visitor visitor);
}