package practice.comparable.wings;

public class Student implements Comparable {
int rollNo;
String name;



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
public int compareTo(Object o) {
	Student s=(Student) o;
	
	return this.name.compareTo(s.name);	
}



//@Override
//public int compareTo(Object o) {
//	Student s1=(Student)o;
//	if(this.rollNo==s1.rollNo)
//		return 0;
//	else if(this.rollNo>s1.rollNo)
//		return +1;
//	else
//		return -1;
//}


}
