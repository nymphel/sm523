package tr.edu.metu.sm.dp.tax;

public class TaxSimpleAdapter extends TaxCalcPro implements TaxSimple  {

	@Override
	public double calculateTax_ts() {
		System.out.println("TaxSimpleAdapter ::: calculateTax_ts method is called");
		
		double tax = super.tax_calculateTaxForTypeA();
		tax += super.tax_calculateTaxForTypeB();
		
		return tax;
	}

	@Override
	public double calculateTaxForSub_ts() {
		System.out.println("TaxSimpleAdapter ::: calculateTaxForSub_ts method is called");
		
		double tax = super.tax_calculateTaxForTypeB();
		tax += super.tax_calculateTaxForTypeC();
		
		return tax;
	}

}
