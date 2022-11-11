package practice.comparator.comparable;

import java.util.Comparator;

public class EmployeeName implements Comparator<Employee>{
	
	
	@Override
	public int compare(Employee o1, Employee o2) {
		int res = (o1.name.compareTo(o2.name));
		return res;
	}
}
//public class EmployeeName implements Comparator{
//	
//	
//	@Override
//	public int compare(Object o1, Object o2) {
//		int res = -((Employee)o1).name.compareTo(((Employee)o2).name);
//		return res;
//	}
//}
