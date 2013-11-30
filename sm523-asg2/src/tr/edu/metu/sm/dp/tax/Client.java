package tr.edu.metu.sm.dp.tax;

public class Client {

	public static void main(String[] args) {

		Employee individual = new Individual();
		individual.calculateTax();
		
		Employee subcontractor = new Subcontractor();
		subcontractor.calculateTax();
		
		Employee enterprise = new Enterprise();
		enterprise.addChild(new Subcontractor());
		enterprise.addChild(new Individual());
		enterprise.listTaxes();

	}

}
