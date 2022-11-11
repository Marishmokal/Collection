package practice.comparator.comparable;

import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String[] args) {
	Employee e1=new Employee("Vayahare",115,"washim");
	Employee e2=new Employee("Pisal",172,"hingoli");
	Employee e3=new Employee("Satav",75,"kolhapur");
	Employee e4=new Employee("Mhatre",123,"amravati");
	
	
//	TreeSet t=new TreeSet(new EmployeeName());
//	t.add(e1);
//	t.add(e4);
//	t.add(e2);
//	t.add(e3);
//	System.out.println(t);
	
	
//	TreeSet t=new TreeSet(new EmployeeCity());
//	t.add(e1);
//	t.add(e4);
//	t.add(e2);
//	t.add(e3);
//	System.out.println(t);
	
	TreeSet t=new TreeSet(new EmployeeId());
	t.add(e1);
	t.add(e4);
	t.add(e2);
	t.add(e3);
	System.out.println(t);
}
}
