package practice.comparator.comparable;

import java.util.Comparator;

public class EmployeeCity implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int res1= -(o1.city.compareTo(o2.city));
		return res1;
	}

}
