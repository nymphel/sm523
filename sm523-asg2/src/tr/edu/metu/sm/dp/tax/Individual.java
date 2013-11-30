package tr.edu.metu.sm.dp.tax;

public class Individual implements Employee {

	@Override
	public void calculateTax() {
		System.out.println("calculating individual tax");
		TaxSimple taxSimpleAdapter = new TaxSimpleAdapter();
		double calculateTax_ts = taxSimpleAdapter.calculateTax_ts();
		System.out.println(calculateTax_ts);

	}

	@Override
	public void listTaxes() {
		// no need to implement for child node

	}

	@Override
	public void addChild(Employee employee) {
		// no need to implement for child node
		
	}

	@Override
	public void removeChild(Employee employee) {
		// no need to implement for child node
		
	}

	@Override
	public Employee getChild(int i) {
		// no need to implement for child node
		return null;
	}

}
