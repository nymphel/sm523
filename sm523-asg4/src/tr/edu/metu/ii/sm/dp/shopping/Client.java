package tr.edu.metu.ii.sm.dp.shopping;

import java.util.Random;

/** client */
public class Client {
	
	private static final int THRESHOLD = 10;
	private static final int RANGE_MAX = 101;

	public static void main(String[] args) {

		Observer goldenCustomer = new GoldenCustomer();
		Observer goldenCustomer2 = new GoldenCustomer();
		
		Observer silverCustomer = new SilverCustomer();
		Observer silverCustomer2 = new SilverCustomer();
		Observer silverCustomer3 = new SilverCustomer();
		Observer directorOfSales = new DirectorOfSales();
		Observer directorOfMarketing = new DirectorOfMarketing();

		DiscountSubject discountSubjectForRange = new DiscountSubject();
		discountSubjectForRange.register(goldenCustomer);
		discountSubjectForRange.register(goldenCustomer2);
		
		DiscountSubject discountSubjectForCritical = new DiscountSubject();
		discountSubjectForCritical.register(silverCustomer);
		discountSubjectForCritical.register(silverCustomer2);
		discountSubjectForCritical.register(silverCustomer3);
		discountSubjectForCritical.register(directorOfSales);
		discountSubjectForCritical.register(directorOfMarketing);
		
		Integer[] stocks = {9,9,9,9,9,9,9,10,15,25,40,75,100,200,350};
		int idx = new Random().nextInt(stocks.length);
		int stock = (stocks[idx]);
		System.out.println("stock is: " +stock);
		
		if(stock < THRESHOLD) {
			discountSubjectForCritical.setAvailable(true);
			discountSubjectForRange.setAvailable(false);
		} else if(THRESHOLD <= stock && stock < RANGE_MAX) {
			discountSubjectForCritical.setAvailable(false);
			discountSubjectForRange.setAvailable(true);
		}

	}

}
