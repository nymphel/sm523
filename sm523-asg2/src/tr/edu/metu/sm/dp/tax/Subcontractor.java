package tr.edu.metu.sm.dp.tax;

public class Subcontractor implements Employee {

	@Override
	public void calculateTax() {
		System.out.println("calculating subcontractor tax");
		TaxSimple taxSimpleAdapter = new TaxSimpleAdapter();
		double calculateTaxForSub_ts = taxSimpleAdapter.calculateTaxForSub_ts();
		System.out.println(calculateTaxForSub_ts);

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
