package behavioral.visitor;

public class PostageVisitor implements Visitor {

	private double totalPostageForCart;

	@Override
	public void visit(Book book) {
		// assume we have a calculation here related to weight and price
		// free postage for a book over 10
		if (book.getPrice() < 10.0) {
			totalPostageForCart += book.getWeight() * 2;
		} else {
			totalPostageForCart += book.getWeight();
		}

	}

	@Override
	public void visit(CD cd) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(DVD dvd) {
		// TODO Auto-generated method stub

	}

	public double getTotalPostageForCart() {
		return totalPostageForCart;
	}
	
	

}
