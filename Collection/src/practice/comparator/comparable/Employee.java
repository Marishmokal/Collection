package practice.comparator.comparable;

import java.util.Comparator;
import java.util.Objects;

public class Employee {
String name;
int id;
String city;
public Employee() {
	super();
	
	
}
public Employee(String name, int id, String city) {
	super();
	this.name = name;
	this.id = id;
	this.city = city;
	
	
}
@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", city=" + city + "]";
	
	
}
@Override
public int hashCode() {
	return Objects.hash(city, id, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!(obj instanceof Employee))
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(city, other.city) && id == other.id && Objects.equals(name, other.name);
}
}
