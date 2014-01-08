package tr.edu.metu.ii.sm.dp.shopping;

import java.util.ArrayList;
import java.util.List;

//Client
public class Client {

	public static void main(String[] args) {
		
		List<Product> products = getProducts();
		
		ReportContext context = new ReportContext();
		
		context.setReportStrategy(new CostReportStrategy());
		context.showReport(products);
		
		context.setReportStrategy(new FollowerReportStrategy());
		context.showReport(products);
		
		context.setReportStrategy(new NegativeCommentReportStrategy());
		context.showReport(products);
		
	}

	private static List<Product> getProducts() {
		Product p1 = new Product();
		p1.setName("ASUS ROG G750JW–DB71, 17.3");
		p1.setCost(1399);
		p1.getFollowers().add("Edward Norton");
		p1.getFollowers().add("Liam Neeson");
		
		Product p2 = new Product();
		p2.setName("Dell Inspiron 14R-5421 Factory RB, 14");
		p2.setCost(599);
		p2.getNegativeComments().add("Overheating problem!");
		p2.getNegativeComments().add("Keypad is not comfortable.");
		p2.getNegativeComments().add("Battery does not last long.");
		
		List<Product> products = new ArrayList<>();
		products.add(p1);
		products.add(p2);
		
		return products;
	}

}
