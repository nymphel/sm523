package tr.edu.metu.ii.sm.dp.shopping;

import java.util.List;

public class CostReportStrategy implements ReportStrategy {

	@Override
	public void showReport(List<Product> products) {
		
		int totalCost = 0;
		for (Product product : products) {
			System.out.println("Product name: "+ product.getName() + ", Product Cost: "+product.getCost());
			totalCost += product.getCost();
		}
		
		System.out.println("Total cost is: "+totalCost);
	}

}
