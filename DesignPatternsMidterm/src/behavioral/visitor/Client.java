package behavioral.visitor;

public class Client {

	public static void main(String[] args) {
		Book book = new Book(5,13);
		Book book2 = new Book(100, 50);
		
		PostageVisitor postageVisitor = new PostageVisitor();
		postageVisitor.visit(book);
		System.out.println("totalPostageForCart" + postageVisitor.getTotalPostageForCart());
		
		postageVisitor.visit(book2);
		System.out.println("totalPostageForCart" + postageVisitor.getTotalPostageForCart());

	}

}
