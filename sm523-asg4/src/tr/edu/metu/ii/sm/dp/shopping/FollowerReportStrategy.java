package tr.edu.metu.ii.sm.dp.shopping;

import java.util.List;

//Concrete Strategy
public class FollowerReportStrategy implements ReportStrategy {

	@Override
	public void showReport(List<Product> products) {
		
		for (Product product : products) {
			System.out.println("Product name: "+ product.getName());
			List<String> followers = product.getFollowers();
			if(followers.isEmpty()) {
				System.out.println("This product has no followers!");
			} else {
				System.out.println("List of followers: ");
				for (String follower : followers) {
					System.out.println(follower);
				}
			}
			
		}
		
	}

}
