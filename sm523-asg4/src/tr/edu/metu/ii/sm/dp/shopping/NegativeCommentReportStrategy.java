package tr.edu.metu.ii.sm.dp.shopping;

import java.util.List;

//Concrete Strategy
public class NegativeCommentReportStrategy implements ReportStrategy {

	@Override
	public void showReport(List<Product> products) {
		
		for (Product product : products) {
			System.out.println("Product name: "+ product.getName());
			List<String> negativeComments = product.getNegativeComments();
			if(negativeComments.isEmpty()) {
				System.out.println("This product has no negative comments!");
			} else {
				System.out.println("List of negative comments: ");
				for (String negativeComment : negativeComments) {
					System.out.println(negativeComment);
				}
			}
			
		}
		
	}

}
