package tr.edu.metu.sm.dp.tax;

public interface Employee {
	
	public void calculateTax();
	public void listTaxes();
	public void addChild(Employee employee);
	public void removeChild(Employee employee);
	public Employee getChild(int i);

}
