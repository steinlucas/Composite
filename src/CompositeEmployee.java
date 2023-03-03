import java.util.ArrayList;

public class CompositeEmployee implements Employee {

	ArrayList<Employee> aEmployees = new ArrayList<>();
	
	@Override
	public void showEmployeeDetails() {
		for (Employee employe : aEmployees) {
			employe.showEmployeeDetails();
		}
	}
	
	public void addEmployee(Employee employee) {
		aEmployees.add(employee);
	}
}