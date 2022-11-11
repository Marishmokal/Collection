package Hashset.methods;

import java.util.Objects;

/**
 * @author Shree
 *
 */
public class Student {
int rollNo;
String name;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int rollNo, String name) {
	super();
	this.rollNo = rollNo;
	this.name = name;
}
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + "]";
}
@Override
public int hashCode() {
	return Objects.hash(name, rollNo);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!(obj instanceof Student))
		return false;
	Student other = (Student) obj;
	return Objects.equals(name, other.name) && rollNo == other.rollNo;
}





}
