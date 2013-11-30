package tr.edu.metu.sm.dp.tax;

import java.util.ArrayList;
import java.util.List;

public class Enterprise implements Employee {
	
	private List<Employee> employees = new ArrayList<>();

	@Override
	public void calculateTax() {
		// no need to implement for parent node

	}

	@Override
	public void listTaxes() {
		System.out.println("listing employees & subcontructor taxes...");
		for (Employee employee : employees) {
			employee.calculateTax();
		}

	}

	@Override
	public void addChild(Employee employee) {
		employees.add(employee);
		
	}

	@Override
	public void removeChild(Employee employee) {
		employees.remove(employee);
		
	}

	@Override
	public Employee getChild(int i) {
		return employees.get(i);
	}
	
	public List<Employee> getEmployees() {
		return employees;
	}


}
